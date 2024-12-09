package estruturaDados;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class exercicioPilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
        int opcao= 1;
		Scanner leia = new Scanner(System.in);

		 do {
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo livro na pilha");
	            System.out.println("2:  Listar todos os livros da Pilha\r\n" + pilha);
	            System.out.println("3: Retirar um livro da pilha");
	            System.out.println("0: Finalizar o programa");
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            
	            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    leia.skip("\\R?");
                    String nome = leia.nextLine();
                
                    pilha.push(nome);
                    break;
                case 2:
                	System.out.print("Listar todos os livros:  " + pilha);
                    break;
                case 3:
                	System.out.print("\nRetirar livro da pilha \n " + pilha.pop());
                	if(pilha.isEmpty())
                        System.out.print("A sua pilha está vazia! " + pilha);
                	break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            	//	Iterator<String> iterator = pilha.iterator();

            }
	            
       } while(opcao != 0);

 	/* pilha.clear();

 		System.out.println("\nA Pilha está vazia? " + pilha.isEmpty());*/
		

	}

}
	

