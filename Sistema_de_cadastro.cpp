/* ===============================================================
    ALUNO: RENAN VIECILI LAMEU
    Data: 14/05/21
    Programa: Sistema de Cadastro
    Exercicio: Lista 5
   ===============================================================
*/

#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <time.h>
#include <unistd.h>
#define MAX 20

void menu();
void cadastro();
void listar();
int qtdRegistro = 0;
int op;
  
struct TCredencial {
	char usuario[20];
	char senha[20];	
	
	
};




struct Endereco{
	char logradouro[MAX];
	char bairro[MAX];
	char uf[MAX];
	char cidade[MAX];
};


struct Pessoas{
	char nome[MAX];
	int idade;
	char sexo[MAX];
	struct Endereco endereco;
};

Endereco dados_endereco[MAX];

Pessoas dados_clientes[MAX];

int main(void)
{
	struct TCredencial credencial;
	
	system("color 2");
	
	while(true)
	{
		
		printf("Usuario: ");
		gets(credencial.usuario);
		printf("Senha: ");
		gets(credencial.senha);
		
		if(!strcmp(credencial.usuario, "renan") && !strcmp(credencial.senha,"multivix"))
		{
			
			puts("credencial valida");
			menu();
		}
			
		else{
				puts("credencial invalida");
				system("pause");
				return 0;
			}
		
	
		
	}
	
	
}


void menu()
{
	
		system("cls");	
		system("color 9");
		
			
		puts("============= Area De Cadastro ==============");
		puts("Opcao\n [0. Sair]\n [1. Listar]\n [2. Incluir]\n ");
		scanf("%d",&op);
		
		
		
		switch (op)
		{
			case 0:
				puts("Desconectado...");
				sleep(3);
				system("exit");
				return; 
				
			case 1:
				system("cls");
				puts("Carregando...");
				listar();
				break;
				
			case 2:
				system("cls");
				puts("Carregando...");
				sleep(2);
				cadastro();
				break;
				
			default:
				printf("Opcao Invalida");
				break;	
		}
}


void cadastro(){

	system("color E");
	
	struct Pessoas clientes;
	
	
	int linha = 0;
	
	
	system("cls");

		
			
	for(linha= 0; linha < MAX; linha++)
	{
		//Insira o nome do cliente	
		printf("Nome: ");fflush(stdin);
		gets(dados_clientes[linha].nome);
		
		//Insira a idade do cliente	
		printf("Idade: ");
		scanf("%d",&dados_clientes[linha].idade);
		fflush(stdin);
		//Insira o sexo do cliente	
		printf("Sexo (m) ou (f): ");
		gets(dados_clientes[linha].sexo);
		fflush(stdin);
		
		printf("Cidade: ");
		gets(dados_endereco[linha].cidade);
		fflush(stdin);
		
		printf("Bairro: ");
		gets(dados_endereco[linha].bairro);
		fflush(stdin);
		
		printf("UF: ");
		gets(dados_endereco[linha].uf);
		fflush(stdin);
		
		printf("Logradouro: ");
		gets(dados_endereco[linha].logradouro);
		fflush(stdin);
		
		printf("\nDigite [1. Continuar]\t [0. Cancelar]\n");
		scanf("%d",&op);
		
		if(op == 0)
			menu();
		else
			system("cls");
			continue;	
	
	}
		
}	
	
	


void listar()
{
	system("cls");
	system("color E");
	
	int i;
	printf("********************************\n");
	printf("               LISTAS\n");
	printf("********************************\n");
	for(i = 0; i <= MAX; i++)
	{	printf("\nDADO%d:",i);
		printf("\nNome: %s\nIdade: %d\nSexo: %s \nCidade: %s \nBairro: %s \nUF: %s \nLogradouro: %s\n", dados_clientes[i].nome, dados_clientes[i].idade, dados_clientes[i].sexo,
		dados_endereco[i].cidade,dados_endereco[i].bairro, dados_endereco[i].uf, dados_endereco[i].logradouro);
		
	}
	system("pause");
}


