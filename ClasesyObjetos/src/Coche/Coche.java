package Coche;

public class Coche {
	
	private String modelo;
	private int distanciaTotal=0;
	private int distanciaParcial=0;
	private boolean motor=false;
	private int velocidad=0;
	private int velocidadMaxima;
	
	Coche (String modelo, int maxVelocidad)
	{
		this.modelo=modelo;
		this.distanciaTotal=0;
		this.distanciaParcial=0;
		this.motor=false;
		this.velocidad=0;
		this.velocidadMaxima=maxVelocidad;
	}
	
	boolean arrancar()
	{
		if(this.motor)
		{
			infoError("Motor ya arrancado");
			return false;
		}
		else
		{
			this.motor=true;
			return true;
		}
		
	}
	
	boolean parar()
	{
		if(this.motor)
		{
			this.motor=false;
			this.velocidad=0;
			this.distanciaParcial=0;
			return true;
		}
		else
		{
			infoError("El motor ya está parado");
			return false;
		}
		
		
	}
	
	boolean acelera(int cantidad)
	{
		if(this.motor)
		{
			this.velocidad+=cantidad;
			
			if(this.velocidad>this.velocidadMaxima)
			{
				this.velocidad=this.velocidadMaxima;
			}
			
			return true;
		}
		else
		{
			infoError("No se puede acelerar, el motor está apagado");
			return false;
		}
	}
	
	boolean frena(int cantidad)
	{
		if(this.motor)
		{
			this.velocidad-=cantidad;
			
			if(this.velocidad<0)
			{
				this.velocidad=0;
			}
			return true;
		}
		else
		{
			infoError("No se puede frenar, el motor está apagado");
			return false;
		}
	}
	
	boolean recorre()
	{
		if(this.motor)
		{
			this.distanciaTotal+=velocidad;
			this.distanciaParcial+=velocidad;
			return true;
		}
		else
		{
			infoError("El motor está apagado, no se puede recorrer distancias");
			return false;
		}
	}
	
	String info()
	{
		return this.modelo+" | Velocidad actual: "+this.velocidad+"Km/h | Motor encendido: "+this.motor+" | "+this.distanciaParcial+" Km parciales recorridos | "+this.distanciaTotal+" Kms totales recorridos";
	}
	
	int getKilometros()
	{
		return this.distanciaParcial;
	}
	
	private void infoError(String mensaje)
	{
		System.err.println(mensaje);
	}
	
}
