package exercicio;

import java.util.Random;
import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner in = new Scanner(System.in);
		ListaEncadeada lista = new ListaEncadeada();
		boolean validador = true;
		int resp = 0;
		
		
		for (int i = 0; i < 10; i++) {
			Nodo no = new Nodo(aleatorio.nextInt(25),lista.cabeca);
			lista.insertInicio(no);
		}
		
		lista.printLista();
		
		do {
			validador = false;
			System.out.println("\n1 - Excluir elemento da Lista;");
			System.out.println("2 - Incluir no final da Lista;");
			System.out.println("3 - Incluir ordenado;");
			System.out.println("0 - Para finalizar o programa;");
			System.out.println("\nInforme a opção desejada: ");
			resp = in.nextInt();
			
			switch(resp) {
			case 1:{
				System.out.println("Opção 1 selecionada.");
				System.out.println("Informe o item que deseja excluir da lista: ");
				resp = in.nextInt() - 1;
				
				lista.excluirElemento(resp);
				lista.printLista();
				break;
			}
			case 2:{
				System.out.println("Opção 2 selecionada.");
				System.out.println("Informe o elemento que deseja incluir no final da lista: ");
				resp = in.nextInt();
				
				Nodo last = new Nodo(resp, null);
				lista.insertFinal(last);
				lista.printLista();
				break;
			}
			case 3:{
				System.out.println("Opção 3 selecionada.");
				System.out.println("Imrpimindo a lista ordenada...");
				lista.printListaOrdenada();
			}
			case 0: 
				validador = true;
				break;
			
			default:
				System.out.println("Valor digitado é invalido.");
			}
			
		} while(!validador);
	}
}
