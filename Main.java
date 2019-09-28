package observer;

public class Main {

	public static void main(String[] args) {
	Eleve eleve = new Eleve();
		
		new NotesObserver(eleve);
		
		eleve.ajouterNote(15.0f);
		System.out.println(eleve.getMoyenne());
		eleve.ajouterNote(7.0f);
		System.out.println(eleve.getMoyenne());
		eleve.ajouterNote(13.0f);
		System.out.println(eleve.getMoyenne());
		
	
	}

}
