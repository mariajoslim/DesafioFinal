package dio.br.Robo;

import dio.br.Robo.Robo.MovimentoEnum;

public class Jogo {

	public static void main(String[] args) {

		Robo robo = new Robo();

		Robo shurato = robo;
		shurato.setNome("Shurato");

		Robo shyriu = robo;
		shyriu.setNome("Shyriu");

		Robo sailorMoon = robo;
		sailorMoon.setNome("sailorMoon");

		shurato.mover(MovimentoEnum.AGRESSIVA);
		shyriu.mover(MovimentoEnum.DEFENSIVA);
		sailorMoon.mover(MovimentoEnum.ALEATORIA);
	}
}

//feito com padr�o Prototype