
public class Onibus extends Veiculo {
	private int numassentos;
	
	public Onibus(String nplaca, int ano, int numassentos) {
		super(nplaca, ano);
		this.numassentos= numassentos;		

		}

	public int getNumAssentos() {
		return numassentos;
	}

	public void setNumAssentos(int numassentos) {
	}

	@Override
	public void exibirDados() {
		System.out.println("Placas de Onibus: "+this.getNPlaca());
		System.out.println("Ano: "+this.getAno());
		System.out.println("Quantidade de Assentos: "+this.getNumAssentos());
	}

	

}
