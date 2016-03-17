import java.util.GregorianCalendar;


public class Dvd extends Document{
	protected String producteur;
	protected int duree;
	
	Dvd(String titre, String auteur, String cote,GregorianCalendar cal, String prod, int d){
		super(titre,auteur,cal,cote);
		this.producteur = prod;
		this.duree = d;
	}
}
