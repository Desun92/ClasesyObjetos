package Reloj;

public class PruebaReloj {

	public static void main(String[] args) {
		
		Reloj r1 = new Reloj(20,10,10);
		Reloj r2 = new Reloj(20,10,15);
		
		System.out.println(" Reloj nº 1 "+ r1.mostrarHora() );
		System.out.println(" Reloj nº 2 "+ r2.mostrarHora() );
		
		for (int i=1; i<= 5; i++){
			r1.tictac();
		}
		
		if ( r1.comparar(r2) == 0){
                    System.out.println( " Están en la misma hora.");
		        }

		r1.cambiarFormato24(false);
		r2.cambiarFormato24(false);
	
		System.out.println(" Reloj nº 1 "+ r1.mostrarHora() );
		System.out.println(" Reloj nº 2 "+ r2.mostrarHora() );
		
		r2.setAlarma(14,20);
		r2.setAlarma(true);
		
		// Incremento la hora en una serie de segundos
		
		for (int i=1; i<= 50000; i++){
			r1.tictac();
		}
		
		for (int i=1; i<= 100000; i++){
			r2.tictac(); // Tiene que saltar la alarma
		}
		
		System.out.println("Los relojes se diferencias en "
                                   +  r1.comparar(r2) + " segundos ");

		r1.cambiarFormato24(true);
		r2.cambiarFormato24(true);
		
		System.out.println(" Reloj nº 1 "+ r1.mostrarHora() );
		System.out.println(" Reloj nº 2 "+ r2.mostrarHora() );
					
	}



	}


