package src;

public class Setor {
	
	private String nomeSetor;
	private int codigoSetor;
	
	public Setor(String nomeSetor, int codigoSetor) {
		super();
		this.nomeSetor = nomeSetor;
		this.codigoSetor = codigoSetor;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

}
