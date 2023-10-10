package banco;

public class Cuenta {

	private double Saldo = 0;


	
	
	
	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.Saldo = saldo;
	}

	

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	
	

	public void ingresar(int i) {
		if(i >=0)
		Saldo = Saldo+i;
		else
			System.out.println("No se pueden ingresar numeros negativos");
		
	}
	
	public void retirar(int i) {
		if(Saldo-i>=0 && i>=0)
		Saldo = Saldo-i;
		else
			System.out.println("No tiene suficiente saldo en su cuenta o ha intentado introducir un numero positivo");
		
	}
	
	

}
