
public class Funcionario implements Comparable<Funcionario> {
	
	private int cod;
	private String nome;
	private String cargo;
	private double salario;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario(int c, String n, String ca, double sal) {
		this.setCod(c);
		this.setNome(n);
		this.setCargo(ca);
		this.setSalario(sal);
	}
	
	@Override
	public String toString() {
		return "Funcionario [cod=" + cod + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	@Override
	public int compareTo(Funcionario f) {
		if (this.cod < f.cod) {
			return -1;
		}
		else if (this.cod > f.cod) {
			return 1;
		}
		return 0;
	}
	
}
