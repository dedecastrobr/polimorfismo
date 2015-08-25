package src;

import java.util.Scanner;

public class Visitante extends Pessoa{

	private String numeroCracha;
	private Funcionario funcResp;

	public Visitante() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("===== Dados do Visitante =====");
		System.out.println("Informe o numero do crachá: ");
		this.numeroCracha = scan.nextLine();
		System.out.println("Matricula do funcionário responsável");
		int mat = scan.nextInt();
		
		ControleAcesso.listaPessoas.add(this);
		System.out.println("Visitante cadastrado: " + super.getNome() + " " + super.getSobreNome() + ".");
		System.out.println("Crachá: " + this.numeroCracha);
		
		scan.close();
	}

	public String getNumeroCracha() {
		return numeroCracha;
	}

	public void setNumeroCracha(String numeroCracha) {
		this.numeroCracha = numeroCracha;
	}

	public Funcionario getFuncResp() {
		return funcResp;
	}

	public void setFuncResp(Funcionario funcResp) {
		this.funcResp = funcResp;
	}



}
