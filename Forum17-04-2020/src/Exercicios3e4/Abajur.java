package Exercicios3e4;

public class Abajur {

	private String nomeMarca;
	private float bateria;
	private int nivelLuminosidade;
	private String corLuz;
	private boolean ligado;

	public Abajur() {
		this.bateria = 50;
		this.nivelLuminosidade = 100;
		this.corLuz = "branco";
		this.ligado = false;
	}

	public Abajur(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	public void ligar() {
		if (bateria > 1) {
			ligado = true;
			bateria -= 0.200;
		}

		else {
			throw new RuntimeException("Bateria fraca!");
		}

	}

	public void desligar() {
		if (ligado == true) {
			ligado = false;
			bateria -= 0.200;
		} else {
			throw new RuntimeException("Ja esta desligado!");
		}
	}

	public void trocaCor(int optCor) {
		if (ligado == true) {
			if (optCor == 1) {
				corLuz = "branco";

			}
			if (optCor == 2) {
				corLuz = "amarelo";

			}
			if (optCor == 3) {
				corLuz = "azul";

			}
			
		}
		else {
			throw new RuntimeException("Esta desligado!");
		}

	}

	public void luminosidade(int nivelLuz) {
		if (ligado == true) {
			nivelLuminosidade = nivelLuz;
		} else {
			throw new RuntimeException("Esta desligado!");
		}

	}

	public String getCorLuz() {
		return corLuz;
	}

	public float QuantoTemBateria() {
		return bateria;
	}

	public void setBateria(float bateria) {
		this.bateria = bateria;
	}
	
	public void carregarBateria() {
		bateria = 100;
	}

}
