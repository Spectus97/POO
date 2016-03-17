import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Mediatheque {

	List<Document> DocList;
	
	public Mediatheque(){
		DocList = new ArrayList<Document>();
	}
	
	public void ajouterDocument(Document doc){
		DocList.add(doc);
	}
	
	public Document rechercherDocument(String cote){
		for(Iterator<Document> itr = DocList.iterator(); itr.hasNext();){
			Document e = itr.next();
			if(e.getCote() == cote){
				return e;
			}
		}
		return null;
	}
	
	public void afficherEmprunt(){
		for(Iterator<Document> itr = DocList.iterator(); itr.hasNext();){
			Document e = itr.next();
			if(!e.estLibre()){
				System.out.println(e.toString());
			}
		}
	}
	
	public boolean emprunter(String cote, int emprunteur){
		for(Iterator<Document> itr = DocList.iterator(); itr.hasNext();){
			Document e = itr.next();
			if(e.aPourCote(cote) && e.estLibre()){
				e.emprunt(emprunteur);
				return true;
			}
		}
		return false;
	}
	
	public boolean restituer(String c){
		for(Iterator<Document> itr = DocList.iterator(); itr.hasNext();){
			Document e = itr.next();
			if(e.aPourCote(c)){
				e.restitution();
			}
		}
		return false;
	}
	
}
