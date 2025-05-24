package abstractMethod;

public class FabricaPopular implements FabricaDeCarro{

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub
		return new CarroPopular();
	}

	@Override
	public Motor criarMotor() {
		// TODO Auto-generated method stub
		return new MotorSimples();
	}

}
