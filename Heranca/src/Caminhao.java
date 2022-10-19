
public class Caminhao extends Veiculo {
	private int neixos;
	
	public Caminhao(String nplaca, int ano, int neixos) {
		super(nplaca, ano);
		this.neixos=neixos;
		
		
		}

	public int getEixos() {
		return neixos;
	}

	public void setEixos(int neixos) {
		this.neixos = neixos;
	}

	@Override
	public void exibirDados() {
		System.out.println("NPlaca: " +this.getNPlaca());
		System.out.println("Ano:"+this.getAno());
		System.out.println("NEixos: "+this.getNEixos());
		
		// TODO Auto-generated method stub
	}

	
}
