package delegacao;

public class Consulta {
	static GerarCobranca gc;

	public Consulta() {
		gc = new GerarCobranca();
		
	}

	public double GerarCobranša(double valor) {

		return gc.getCobranca(valor);
	}
}
