import java.util.ArrayList;
import java.util.List;

public class Cap15_Lab2 {

	public static void main(String[] args) {
		List<Estudante> lista = new ArrayList<>();
		
		lista.add(new Estudante("Joana" ,8.5 ,8.5 ));
		lista.add(new Estudante("Antônio" ,6.0 ,9.0 ));
		lista.add(new Estudante("Mariana" ,7.5 ,9.0 ));
		lista.add(new Estudante("Ricardo" ,7.0 ,6.0 ));
		lista.add(new Estudante("Gustavo" ,9.5 ,10.0 ));
		
		lista.forEach(e -> e.setMedia((e.getNotaMatematica() + e.getNotaPortugues())/2));
		
		lista.forEach(e -> System.out.println(e.getNome() + " média: " + e.getMedia()));
	}

}
