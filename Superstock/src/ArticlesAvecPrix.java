public class ArticlesAvecPrix{
	public ArticlesEnStock r;
	private int prix_unitaire;
	private String nom;
	private String code;
	private int prix_total;
	
	ArticlesAvecPrix(String nom, String code){
		this.nom = nom;
		this.code = code;
		
		r = new ArticlesEnStock(this.nom,this.code);
		
	}
	
	public void setPrixUnitaire(int prix){
		this.prix_unitaire = prix;
	}
	
	public void ajouter(int nb){
		r.ajouter(nb);
		prix_total += (nb*prix_unitaire);
	}
	
	public int getPrixMoyen(){
		return (prix_total / r.getQuantite());
	}
	
	public void retrait(int nb){
		prix_total -= (nb*(prix_total / r.getQuantite()));
		r.retirer(nb);
	}
}