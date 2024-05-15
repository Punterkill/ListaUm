public class Retangulo {

		private double base;
		private double altura;

		public Retangulo(double novaBase, double novaAltura) {
			this.base = novaBase;
			this.altura = novaAltura;
		}
//get
		
		public double getBase() {
			return base;
		}
		public double getAltura() {
			return altura;
		}
//set
		
		public void setBase(double novaBase) {
			this.base = novaBase;
		}
		public void setAltura(double novaAltura) {
			this.altura = novaAltura;
		}
		
//calcularArea
		
		public double calcularArea(double base, double altura) {
			return base * altura;
		}
		
//calcularPerimetro
		
		public double calcularPerimetro(double base, double altura) {
			return (base + base) + (altura + altura);
		}

}

