package observer;

public class NotesObserver extends Observer{

	public NotesObserver(Eleve eleve){
		this.eleve = eleve;
		this.eleve.attach(this);
	}

	@Override
	public void update() {
		
		float moyenne = 0;
		
		for(float note : eleve.getNotes()) {
			moyenne += note;
		}
		
		moyenne /= eleve.getNotes().size();
		
		eleve.setMoyenne(moyenne);
	}

}