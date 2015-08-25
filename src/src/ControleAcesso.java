package src;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleAcesso{
	
	public static final ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	private static final String[] menuOpcoes = {"1 - Cadastrar Funcionario \n", 
												"2 - Cadastrar Visitante \n",
												"3 - Cadastrar Setor \n",
												"4 - Liberar Acesso \n",
												"5 - Listar Pessoas \n", 
												"9 - Sair \n"};
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		boolean sair = false;
		while(!sair){
			
			switch (mostraMenu()) {
			case 1:
				Funcionario f = new Funcionario();
				break;
			case 2:
				Visitante v = new Visitante();
				break;
			case 3:
				listarPessoas();
				break;
			case 99:
				sair = true;
			default:
				System.out.println("Opção inválida");
				break;
			}			
		}	
	}
	
	private static void listarPessoas() {
		for(Pessoa p: listaPessoas){
			System.out.println(p);
		}	
	}
	
	private static int mostraMenu(){		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("####### MENU INICIAL #######: ");
		System.out.println("############################");
		for(String op: menuOpcoes){
			System.out.print(op);
		}
		System.out.println("############################");
		System.out.println("############################");
		System.out.println(" ");
		System.out.println(" ");
		
		int opcaoSelecionada = scan.nextInt();
		return opcaoSelecionada;
	}	
}