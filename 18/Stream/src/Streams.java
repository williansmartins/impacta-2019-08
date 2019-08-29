import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		
		lista.add(new Funcionario(231, "Maria Pinluguina", "Analisadora de Fezes", 3000));
		lista.add(new Funcionario(981, "Alfredo Milongueiro", "Desenvolvedor", 6500));
		lista.add(new Funcionario(769, "Rosinha Perdinhota", "Garoto de programa", 10000));
		lista.add(new Funcionario(28, "Fravinha Debochada", "Mamilografeira", 4000));
		lista.add(new Funcionario(195, "Armindo Relevante", "Correspondente de internet", 2500));
		lista.add(new Funcionario(123, "Catupirento Asfáltico", "Filmador de urubu", 1000));
		lista.add(new Funcionario(9183, "Resolução Porferdinha", "Parteiro", 2500));
		lista.add(new Funcionario(36, "Planermonina Ferradolha", "Mercador", 5000));
		lista.add(new Funcionario(28, "Rebuliça da Candonga", "Mamilografeira", 3000));
		lista.add(new Funcionario(195, "Mentorato de Parmindonga", "Correspondente de internet", 2500));
		lista.add(new Funcionario(123, "Gravindomba Lintomaníaca", "Filmador de urubu", 1200));
		lista.add(new Funcionario(9183, "Marchandinho da Fervontina", "Parteiro", 2800));
		lista.add(new Funcionario(36, "Olentiponda Averingoninda", "Mercadora", 4300));
		
		lista.stream().filter(f -> "Desenvolvedor".equals(f.getCargo())).sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome())).forEach(System.out::println);
		lista.stream().filter(f -> f.getNome().startsWith("M")).forEach(System.out::println);
		lista.stream().sorted().forEach(System.out::println);
		System.out.println("Soma dos salários: " + lista.stream().mapToDouble(f -> f.getSalario()).sum());
		lista.stream().sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome())).forEach(System.out::println);
	}

}
