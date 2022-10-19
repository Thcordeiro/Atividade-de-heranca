
public abstract class Veiculo {
	private String nplaca;
	private int ano;
	
	public Veiculo() {
	}
	
	public Veiculo(String nplaca, int ano) {
		this.nplaca = nplaca;
		this.ano=ano;
	}

	public String getNPlaca() {
		return nplaca;
	}

	public void setNPlaca(String nplaca) {
		this.nplaca = nplaca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

    public abstract void exibirDados();

}
