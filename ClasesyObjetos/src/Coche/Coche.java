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
		this.velocidadMaxima=maxVelocidad;
	}
	
	void arrancar()
	{
		this.motor=true;
	}
	
	void parar()
	{
		this.motor=false;
		this.velocidad=0;
		this.distanciaParcial=0;
	}
	
	void acelera(int cantidad)
	{
		this.velocidad+=cantidad;
		
		if(this.velocidad>this.velocidadMaxima)
		{
			this.velocidad=this.velocidadMaxima;
		}
	}
	
	void frena(int cantidad)
	{
		this.velocidad-=cantidad;
		
		if(this.velocidad<0)
		{
			this.velocidad=0;
		}
	}
	
	void recorre()
	{
		this.distanciaTotal+=velocidad;
		this.distanciaParcial+=velocidad;
	}
	
	String info()
	{
		StringBuilder info=new StringBuilder();
		
		info.append(this.modelo);
		info.append(" ");
		info.append(this.velocidad);
		info.append("Km/h ");
		if(this.motor)
		{
			info.append("motor encendido ");
		}
		else
		{
			info.append("motor apagado ");
		}
		info.append(this.distanciaParcial);
		info.append("Km parciales ");
		info.append(this.distanciaTotal);
		info.append("Km totales");
		return info.toString();
	}
	
	int getKilometros()
	{
		return this.distanciaTotal;
	}
	
	private void infoError(String mensaje)
	{
		System.err.println(mensaje);
	}
	
}
