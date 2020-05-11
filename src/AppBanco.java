import model.ContaBancaria;

public class AppBanco {
	public static void main(String args[]) {
		ContaBancaria c1, c2;
		
		c1 = new ContaBancaria("123.456.789-00", 10001, 1);
		c2 = new ContaBancaria("987.654.321-00", 20002, 2);
		
			
		c1.creditar(4000);
		c2.creditar(1000);
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		if(c1.debitar(2650.0)) {
			System.out.println("Debito efetuado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		if(c2.debitar(1200)) {
			System.out.println("Debito efetuado");
		}
		else {
			System.out.println("Saldo insulficiente");
		}
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		// exemplo de transferencia
		
		if(c1.transferir(200,c2)) {
			System.out.println("Transferencia efetuada");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
	}
}
