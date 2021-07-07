package arvore;

import java.util.LinkedList;
import java.util.List;

public class No {

	public Integer id;
	public List<Aresta> listaArestasAdj;

	public No mstPai;
	public Integer rank;
	public List<Aresta> mstAresta;
	public double L;

	/*
	 classe criada para o No na lista
	 */
	
	 public No() {
		listaArestasAdj = new LinkedList<>();
	}
	 
	public No(Integer id) {
		this.id = id;
		listaArestasAdj = new LinkedList<>();
		mstPai = null;
		rank = 0;
		mstAresta = new LinkedList<Aresta>();
		L = 0;
	}

	/*
	  adiciona a aresta
	  */
	public void addNoAdj(Aresta adj) {
		this.listaArestasAdj.add(adj);
	}
}