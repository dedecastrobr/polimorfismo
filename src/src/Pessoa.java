package src;
import java.util.Scanner;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private String cpf;
	
	public Pessoa() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===== Dados da pessoa =====");
		System.out.println("Informe o nome: ");
		this.nome = scan.nextLine();
		
		System.out.println("Informe o sobrenome: ");
		this.sobreNome = scan.nextLine();
		
		System.out.println("Informe o CPF: ");
		this.cpf = scan.nextLine();	
		scan.close();		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void temAcesso(){
		System.out.println("Pessoa sem credendial!");
	}
	

}