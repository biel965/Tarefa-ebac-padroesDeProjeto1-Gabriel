package abstractMethod;

public class FabricaLuxo implements FabricaDeCarro{

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub
		return new CarroLuxo();
	}

	@Override
	public Motor criarMotor() {
		// TODO Auto-generated method stub
		return new MotorEsportivo();
	}

}
