package java2_StaticFinalProbak;

public class EjemploFinal {
	
	  public static void main(String[] args) {
		  	
		  	final String cadena = "Hola";
		    //cadena = new String("Adios");
		    System.out.println(cadena);

		  
		    final String cadena2 = "Hola";
		    cadena2.concat(" mundo");
		    System.out.println(cadena2);
		  }
}
