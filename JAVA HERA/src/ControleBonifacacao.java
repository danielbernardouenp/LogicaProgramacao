
public class ControleBonifacacao {

	private double soma;

	public void registra(Funcionario f) { // fora do padr�o de heran�a , codigos repetidos
		double boni = f.getBonificacao(); // 3 metodos para a mesma coisa
		this.soma = this.soma + boni;

	}

	public double getSoma() {
		return soma;
	}

}
