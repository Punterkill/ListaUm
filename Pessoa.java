public class Pessoa {
	private String nome;
	private int    idade;
	private double altura;
	
	public Pessoa(String novoNome, int novaIdade, double novaAltura) {
		this.nome = novoNome;
		this.altura = novaAltura;
		this.idade = novaIdade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nIdade:" + this.idade + "\nAltura:" + this.altura + "m";
	}	
}
