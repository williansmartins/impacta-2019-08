package ExUML;

public class App {
	public static void main(String[] args) {
		
		Pagamento a = new Cartao();
		Pagamento b = new Dinheiro();
		Pagamento c = new Cheque();
		
		a.metodo();
		a.metodo2();
	}

}
