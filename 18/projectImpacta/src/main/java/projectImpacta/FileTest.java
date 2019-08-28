package projectImpacta;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("NovoArquivoTest.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			while(true) {
				char c = dados.readChar();
				System.out.println(c);
			}
		}
		catch (IOException e) {
			System.out.println("Erro de I/O!");
			e.printStackTrace();
		}
	}

}
