package arvore;


public class Aresta {

	public No a, b;
	public No originA, originB;
	public Integer peso;

	/*
  Classe da Aresta na qual armazena uma aresta a; uma aresta b e o peso 
  */  
	 
	public Aresta(No a, No b, Integer peso) {
		this.a = a;
		this.b = b;
		this.originA = a;
		this.originB = b;
		this.peso = peso;
	}

	/*
	  
	 	 
	 */
	public No getOutroFim(No no) {
		if(a.equals(no))
			return b;
		else if(b.equals(no))
			return a;
		else if(originA.equals(no))
			return originB;
		else
			return originA;
	}	
}