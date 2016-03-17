public class superstock{
	public Stock s;
	
	superstock(int max){
		s = new Stock(max);
	}
	
	public void ajoutArticle(ArticlesEnStock a){
		s.ajoutArticle(a);
	}
	
	public ArticlesEnStock getArticleByPosition(int num){
		return s.getArticleByPosition(num);
	}
	 
	public int nbReferences(){
		return s.nbReferences();
	}
	
	public ArticlesEnStock getByNom(String nom){
		for(int i = 0; i < s.nbReferences(); i++)
			if(s.getArticleByPosition(i) != null){
				getArticleByPosition(i);
			}else{
				return null;
			}
	}
	
	public ArticlesEnStock getByCode(String code){
		if(s.){
			return
		}else{
			return null
		}
	}
	
	public String toString(){
		return s.toString();
	} 
}