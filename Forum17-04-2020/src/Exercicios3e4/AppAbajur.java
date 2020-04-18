package Exercicios3e4;

public class AppAbajur {
	public static void main(String[] args) {
		Abajur xiaomi = new Abajur();

		try {
			xiaomi.trocaCor(2);
			System.out.println("Luz: " + xiaomi.getCorLuz());

		} catch (RuntimeException testeLuz) {
			System.out.println(testeLuz.getMessage());
		}
		System.out.println("Fim.");
		
		System.out.println("\n");
		
		try {
			xiaomi.ligar();
			xiaomi.trocaCor(3);
			System.out.println("Luz: " + xiaomi.getCorLuz());

		} catch (RuntimeException testeLuz) {
			System.out.println(testeLuz.getMessage());
		}
		System.out.println("Fim.");


		System.out.println("\n");

		try {
			xiaomi.setBateria(0);
			xiaomi.ligar();
			System.out.println(xiaomi.QuantoTemBateria());

		} catch (RuntimeException testeBateria) {
			System.out.println(testeBateria.getMessage());
		}
		System.out.println("Fim.");
		
		
		System.out.println("\n");
		
		try {
			xiaomi.carregarBateria();
			xiaomi.ligar();
			System.out.println(xiaomi.QuantoTemBateria());

		} catch (RuntimeException testeBateria) {
			System.out.println(testeBateria.getMessage());
		}
		System.out.println("Fim.");
	
	
	
	
	}
	
	


}
