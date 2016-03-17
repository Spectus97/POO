import java.util.GregorianCalendar;


public class Document {
	protected String titre;
	protected String auteur;
	protected GregorianCalendar calendrier;
	protected String cote;
	protected int emprunt;
	protected GregorianCalendar dateEmprunt;
	
	Document(String t, String auteur, GregorianCalendar cal, String c){
		this.titre = t;
		this.auteur = auteur;
		this.calendrier = cal;
		this.cote = c;
		this.emprunt = -1;
	}
	
	public int dureeEmprunt(){
		if(this instanceof Livre){
			return 15;
		}else if(this instanceof Dvd){
			return 5;
		}else{
			return -1;
		}
	}
	
	public boolean aPourCote(String c){
		return this.cote.equals(c);
	}
	
	public String getTitre(){
		return this.titre;
	}
	
	public String getAuteur(){
		return this.auteur;
	}
	
	
	public String getCote(){
		return this.cote;
	}
	
	public GregorianCalendar getCal(){
		return this.calendrier;
	}
	
	public boolean emprunt(int emprunteur){
		if(this.emprunt == -1){
			this.emprunt = emprunteur;
			return true;
		}else{
			return false;
		}
	}
	
	public int getEmprunt(){
		return this.emprunt;
	}
	
	public boolean restitution(){
		if(this.emprunt != -1){
			this.emprunt = -1;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean estLibre(){
		if(this.emprunt == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return titre+" - "+auteur+" - "+cote; 
	}
}
