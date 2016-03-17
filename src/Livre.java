import java.util.GregorianCalendar;


public class Livre extends Document{
	protected String editeur;
	protected int pages;
	
	Livre(String titre, String auteur, String cote,GregorianCalendar cal, String e, int p){
		super(titre,auteur,cal,cote);
		this.editeur = e;
		this.pages = p;
	}
}
