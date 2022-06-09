package clnt_ljdpt;

public class MainCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(3000, 1200, 2000);
		cliente.calc_saldo();
		cliente.exib_saldo();
	}

}
