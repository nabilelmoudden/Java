package observer;
import java.util.List;
import java.util.ArrayList;

public class Eleve {
	private List<Observer> observers;
	private List<Float> notes;
	private float moyenne;
	
	public Eleve() {
		observers = new ArrayList<Observer>();
		notes = new ArrayList<Float>();
	}
	
	public void ajouterNote(float note) {
		notes.add(note);
		notifyAllObservers();
	}
	
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	public float getMoyenne() {
		return moyenne;
	}
	
	public List<Float> getNotes() {
		return notes;
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
