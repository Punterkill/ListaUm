public class ClasseCirculo {
	
	public double raio;
	
	public ClasseCirculo(double novoRaio) {
		this.raio = novoRaio;
	}
	
//get
	
	public double getRaio() {
		return raio;
	}

//set
	
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
//calArea 3,14 * a * a
	
	public double calcularArea() {
		return 3.14 * raio * raio;
	}
	
//perimetro
	
}
