package exercicioUML;

public class App {
	public static void main(String[] args) {
		AbstractPagamento a = new Cartao();
		AbstractPagamento b = new Dinheiro();
		AbstractPagamento c = new Cheque();
		
		a.metodo();
		a.metodo2();
	}
}
