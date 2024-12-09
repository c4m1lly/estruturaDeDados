package estruturaDados;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
        int opcao= 1;
		Scanner leia = new Scanner(System.in);
       

        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: retirar um livro da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
       
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = leia.next();
                    fila.add(nome);
                    break;
                case 2:
                	System.out.print("Listas de clientes na fila:  " + fila);
                    break;
                case 3:
                	System.out.print("\nRemover clientes da fila \n " + fila.remove());
                	if(fila.isEmpty())
                        System.out.print("A sua fila está vazia; ");
                	break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

	}
}