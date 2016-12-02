public class TestRectangulo{
	public static void main (String args[]){
		//cramos objetos del tipo Rectangulo
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		//System.out.println(r1); No tiene accesibilidad
		//System.out.println(r2); lado1 y lado2 son atributos privados
		r2.setLado1(100); //actualizo los valores del atributo lado1
		r2.setLado2(1000);//actualizo los valores del atributo lado1
		System.out.printf("Atributos del rectángulo 1, lado 1: %d, lado 2: %d y de area %d%n", r1.getLado1(), r1.getLado2(), r1.getArea());
		System.out.printf("Atributos del rectángulo 2, lado 1: %d, lado 2: %d y de area %d%n", r2.getLado1(), r2.getLado2(), r2.getArea());
		
	}
}
