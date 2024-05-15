public class Cliente {
	private String nome;
	private String cpf;
	private int dia;
	private int mes;
	private int ano;
	
	public Cliente(String novoNome, String novoCpf, int novoDia, int novoMes, int novoAno) {
		this.nome = novoNome;
		this.cpf = novoCpf;
		this.dia = novoDia;
		this.mes = novoMes;
		this.ano = novoAno;
	}
	
//get
	 
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	
//set
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	public void setDia(int novoDia) {
		this.dia = novoDia;
	}
	public void setMes(int novoMes) {
		this.mes = novoMes;
	}
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nCPF:" + this.cpf + " \nData:" + this.dia + "/" + this.mes + "/" + this.ano;
	}	
}
