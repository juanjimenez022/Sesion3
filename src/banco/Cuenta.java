package banco;

public class Cuenta {

	private double Saldo = 0;


	
	
	
	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		Saldo = saldo;
	}

	

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	
	

	public void ingresar(int i) {
		Saldo = 1000;
		
	}
	
	public void retirar(int i) {
		Saldo = 0;
		
	}
	
	

}
