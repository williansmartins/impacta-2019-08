import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cap15_Lab1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> pessoaMap = new HashMap<>();
		pessoaMap.put("André", 30);
		pessoaMap.put("Ana", 38);
		pessoaMap.put("Pedro", 42);
		pessoaMap.put("Margarida", 29);
		
		Iterator<String> itr = pessoaMap.keySet().iterator();
		
		System.out.println("-- Pessoas --");
		
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = pessoaMap.get(key);
			
			System.out.println(key + ": " + value);
		}
		
		System.out.println("-- Pessoas --");
		
		for (HashMap.Entry<String, Integer> entry : pessoaMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println("-- Pessoas --");
		
		pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
