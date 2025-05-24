package abstractMethod;

public class Main {
	public static void main(String[] args) {
		//Carro popular
		FabricaDeCarro fabricaPopular = new FabricaPopular();
		Carro carro1 = fabricaPopular.criarCarro();
		Motor motor1 = fabricaPopular.criarMotor(); 
		
		carro1.exibirInformacao();
		motor1.exibirInformacao();
		
		System.out.println("------------------------");
		
		//Carro Luxuoso
		FabricaDeCarro fabricaLuxo = new FabricaLuxo();
		Carro carro2 = fabricaLuxo.criarCarro();
		Motor motor2 = fabricaLuxo.criarMotor();
		
		carro2.exibirInformacao();
		motor2.exibirInformacao();
	}
}
