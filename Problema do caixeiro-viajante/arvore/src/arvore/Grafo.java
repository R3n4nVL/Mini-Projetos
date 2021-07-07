package arvore;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Grafo {
	public List<No> nodosList;
	public List<Aresta> arestasList;
	public Integer noDosNodos;
	public Integer noDasArestas;
	public Map<Integer, No> nodosHashMap;
	
	public List<Aresta> mstArvArestasList;

	public Grafo() {
		nodosList = new LinkedList<No>();
		arestasList = new LinkedList<Aresta>();
		nodosHashMap = new HashMap<>();
		noDosNodos = 0;
		noDasArestas = 0;
		mstArvArestasList = new LinkedList<Aresta>();

	}

	/**
	 	interliga os nodos e arestas no grafo
	 */
	
	public void addNoEAresta(No no1, No no2, Integer peso) {
		if(nodosHashMap.containsKey(no1.id)) {
			no1 = nodosHashMap.get(no1.id);
		} else {
			nodosList.add(no1);
			nodosHashMap.put(no1.id, no1);
		}

		if(nodosHashMap.containsKey(no2.id)) {
			no2 = nodosHashMap.get(no2.id);
		} else {
			nodosList.add(no2);
			nodosHashMap.put(no2.id, no2);
		}

		Aresta aresta = new Aresta(no1, no2, peso);
		arestasList.add(aresta);	// aresta na lista do arquivo
		no1.addNoAdj(aresta);		//  lista da matriz no no1
		no2.addNoAdj(aresta);		//  lista da matriz no no2
	}

	/*
	  Algoritmo de Kruskal 
	 */
	public void Kruskal() {

		No ru, rv;
		for(No no: nodosList)
			MakeSet(no);
		for(Aresta aresta : arestasList) {					//as arestas serão ordenada de forma decrescente
			ru = Buscar(aresta.originA);
			rv = Buscar(aresta.originB);
			if(!ru.equals(rv)) {
				mstArvArestasList.add(aresta);
				aresta.originA.mstAresta.add(aresta);
				aresta.originB.mstAresta.add(aresta);
				Union(ru,rv);
			}
		}
	}
	private void Union(No ru, No rv) {
		if(ru.rank > rv.rank)
			rv.mstPai = ru;
		else if(rv.rank > ru.rank)
			ru.mstPai = rv;
		else {
			rv.mstPai = ru;
			++ru.rank;
		}
	}
	private No Buscar(No no) {
		if(no.mstPai.equals(no))
			return no;
		return Buscar(no.mstPai);
	}
	private void MakeSet(No no) {
		no.mstPai = no;
	}
}