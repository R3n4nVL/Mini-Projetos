/*
  				TRABALHO DE TEORIA DA COMPUTAÇAO E ANALISE DE ALGORITMO
  									ARVORE GERADORA
  										MINIMA
  
  
  ALUNO: RENAN VIECILI LAMEU          MATRICULA:1-1711734 
  TURMA:ECO-07NA
  PROFº:GUYLERME VELASCO DE SOUZA 
  
 */



package arvore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class arvore {

		public static void main(String[] args) throws IOException {

		FuncoesExtras of = new FuncoesExtras();

		/*
		  Ler a entrada do arquivo
		  obs: tem dois arquivos txt que podem ser exibidos
		  caso queira acessar só trocar dados1.txt por dados2.txt 
		  
		*/
		
		BufferedReader br = new BufferedReader(new FileReader("dados1.txt"));
		
		/*           Arvore inicial inserida no arquivo dados1.txt
		 * 
		  					1---5---4---4---3
							 \		|      /
							  \	    |     /
							  6\	|3   /2
								\	|   /  
								 \	|  /
								  \ | /
                                   \2/

                                   
                     Arvore inicial inserida no arquivo dados2.txt          
                                   
                               1---12---2    
                               |\      /|\
                               | \   4/ | \
                               |  \  /  |  \                                 
                             10|   \/  5|   \3
                               |   /\   |    \
                               |  /13\  |     \
                               | /    \ |      \							  
                                3--3---5 ---4---4
                                  
		 */

		
		
		String linha = null;
		of.analisarEntradaPrimeiraLinha(br.readLine());		// leitura da primeira linha do arq para definir arestas e nó raiz
		while( (linha = br.readLine()) != null)
			of.addAOGrafo(linha);
		br.close();

		of.ExecFunc();

	}

}