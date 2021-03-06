package dio.br.Robo;

public class Robo {

	static enum MovimentoEnum {
		AGRESSIVA, DEFENSIVA, ALEATORIA
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Robo() {
		inicializar();
	}

	private void inicializar() {
	}

	public class MovimentoAleatorio {

		public void execute() {

		}
	}

	public void mover(MovimentoEnum acao) {
		if (MovimentoEnum.AGRESSIVA.equals(acao)) {

		} else if (MovimentoEnum.DEFENSIVA.equals(acao)) {

		} else if (MovimentoEnum.ALEATORIA.equals(acao)) {

			new MovimentoAleatorio().execute();
		}
	}
}
