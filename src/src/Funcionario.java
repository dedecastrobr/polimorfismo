package src;

import java.util.Scanner;

public class Funcionario extends Pessoa {
	
	public static enum Cargo { DIRETOR, SUPERVISOR, AUXILIAR};
	
	private String matricula;
	private Cargo cargo;

	public Funcionario() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("===== Dados do funcionario =====");
		System.out.println("Informe a matricula: ");
		this.matricula = scan.nextLine();
		System.out.println("Informe o cargo: DIRETOR | SUPERVISOR | AUXILIAR");
		this.cargo = Cargo.valueOf(scan.nextLine());
		
		ControleAcesso.listaPessoas.add(this);
		System.out.println("Criado o funcionário " + super.getNome() + " " + super.getSobreNome() + ".");
		System.out.println("Matricula: " + this.matricula);


	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	

}
