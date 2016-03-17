import java.util.GregorianCalendar;


public class EssaiMediatheque{
	
	public static void main(String[] args){
		Mediatheque biblio = new Mediatheque();
		
		Document doc = new Document("Test","Rodolphe",new GregorianCalendar(),"00001");
		Document doc1 = new Document("Tes1","Patrick",new GregorianCalendar(),"00002");
		Document doc2 = new Document("Test2","George",new GregorianCalendar(),"00003");
		
		Document livre = new Livre("titre","auteur","00005",new GregorianCalendar(),"editeur",100);
		Document dvd = new Dvd("titre","auteur","00006",new GregorianCalendar(),"producteur",60);
		
		biblio.ajouterDocument(doc);
		biblio.ajouterDocument(doc1);
		biblio.ajouterDocument(doc2);
		
		biblio.ajouterDocument(livre);
		biblio.ajouterDocument(dvd);
		
		biblio.emprunter("00005", 3);
		biblio.emprunter("00006", 4);
		
		biblio.afficherEmprunt();
		
		System.out.println(doc.dureeEmprunt());
		
		//biblio.restituer("00001");
		
		//biblio.afficherEmprunt();
		//System.out.println(biblio.rechercherDocument("00004"));
	}
	
}
