package arvore;

public class FuncoesExtras {

	public Grafo raiz;
	public No noRaiz;

	/**
	 * Acesso da classe FuncoesExtras 
	 */
	public FuncoesExtras() {
		raiz = new Grafo();
		noRaiz = null;
	}

	/**
	 Verifica a primeira linha de entrada
	 */
	public void analisarEntradaPrimeiraLinha(String linha) {
		String splitStr[] = linha.split("\\s+");
		raiz.noDosNodos = Integer.parseInt(splitStr[0]);
		raiz.noDasArestas = Integer.parseInt(splitStr[1]);
	}

	/**
	 * Analisar as linhas restantes da entrada
	 */
	public void addAOGrafo(String str) {
		String splitStr[] = str.trim().split("\\s+");

		No a, b;
		Integer id1 = Integer.parseInt(splitStr[0]);
		Integer id2 = Integer.parseInt(splitStr[1]);
		if(raiz.nodosHashMap.containsKey(id1)) {
			a = raiz.nodosHashMap.get(id1);
		} else {
			a = new No(id1);
		}
		if(raiz.nodosHashMap.containsKey(id2)) {
			b = raiz.nodosHashMap.get(id2);
		} else {
			b = new No(id2);
		}

		if(noRaiz == null) {
			noRaiz = a;
		}

		raiz.addNoEAresta(a,b, Integer.parseInt(splitStr[2]));		// adiciona Nó e Aresta (mostra no console)
	}

	public Double Custo(Double custo){
		for(Aresta aresta : raiz.mstArvArestasList) {
			 custo+= aresta.peso;
		}
		return custo;
	}
	
	public void ExecFunc() {

		 // 1) Algoritmo de Kruskal para encontrar Arvore geradora minima
		 
		Integer custo =0;
		raiz.Kruskal();						// arvore possui as arestas da arv MST
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("\nArestas na Arvore geradora a partir do Algoritmo de  Kruskal :");
		for(Aresta aresta : raiz.mstArvArestasList) {
			System.out.println("(" + aresta.a.id + "," + aresta.b.id + ") = " + aresta.peso);
			custo = custo + aresta.peso;
		}
		System.out.println("\n---------------------------------------------------------------------------------------------------------");
		System.out.println("Custo Minimo gerado :"+ custo);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		/*  a partir do arquivo dados1.txt, a arvore a ser gerada é:
		 * 
		  			    	1--- 5 ---4--- 4 ---3
		  					 		  |
		  					 		  |3
		  					 		  |
		  					 		  6 	
		  					 
		  					 
		  					 
	  		a partir do arquivo dados1.txt, a arvore a ser gerada é:
	  		 
		  					 1--- 12 ---2    
                                         \
                                          \
                                           \                                 
                                            \3
                                             \
                                              \
                                               \							  
                                3-- 3 --5-- 4 --4

		 
		 */
		
	}
}