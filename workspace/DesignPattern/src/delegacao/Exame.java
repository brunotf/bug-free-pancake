package delegacao;

public class Exame {

	GerarCobranca gc;

	public double GerarCobranša(double valor) {

		gc = new GerarCobranca();

		return gc.getCobranca(valor);
	}
}
