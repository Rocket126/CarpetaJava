package javaPoo;

public class EjercicioTres {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaBancaria  = new CuentaBancaria("123456-9", 100.000, "Cuenta Corriente");
		
		CuentaBancaria cuentaBancaria2  = new CuentaBancaria("654123-9", "Cuenta Rut");
		
		System.out.println(cuentaBancaria.numeroCuenta+" "+cuentaBancaria.saldo+" "+cuentaBancaria.tipoCuenta);
		
		System.out.println(cuentaBancaria2.numeroCuenta+" "+cuentaBancaria2.tipoCuenta);
	}

}
class CuentaBancaria{
	
	String numeroCuenta; 
	double saldo;
	String tipoCuenta;
	
	CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta)
	{
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
	}
	
	CuentaBancaria(String numeroCuenta, String tipoCuenta)
	{
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
	}
	
}