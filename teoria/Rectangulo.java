public class Rectangulo{
	//atributos
	private int lado1;
	private int lado2;
	
	//getters
	public int getLado1(){
		return this.lado1;
	}
	
	public int getLado2(){
		return this.lado2;
	}
	
	//setters
	public void setLado1(int l1){
		this.lado1 = l1;
	}
	
	public void setLado2(int l2){
		this.lado2 = l2;
	}
	//método que devuelve el valor del área
	public int getArea(){
		return this.lado1 * this.lado2;
	}
}
