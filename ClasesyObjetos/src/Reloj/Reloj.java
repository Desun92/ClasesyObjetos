package Reloj;

public class Reloj {
	
	private int segundos=0;
	private boolean formato24=false;
	
	Reloj (int horas, int minutos, int segundos)
	{
		this.segundos = horas*3600 + minutos * 60 + segundos;
	}
	
	String mostrarHora()
	{
		int horas;
		int minutos;
		int segs;
		boolean for24=this.formato24;
		boolean masde12=false;
		StringBuilder cadena=new StringBuilder();
		
		horas=this.segundos/3600;
		
		while(horas>=24)
		{
			horas-=24;
		}
		
		minutos=this.segundos/60;
		
		while(minutos>=60)
		{
			minutos-=60;
		}
		
		segs=this.segundos;
		
		while(segs>=60)
		{
			segs-=60;
		}
		
		if(!for24)
		{
			if(horas>12)
			{
				horas-=12;
				masde12=true;
			}
		}
		
		cadena.append(horas);
		cadena.append(":");
		cadena.append(minutos);
		cadena.append(":");
		cadena.append(segs);
		
		if(!for24)
		{
			if(masde12)
			{
				cadena.append("pm");
			}
			else
			{
				cadena.append("am");
			}
		}
		
		return cadena.toString();
	}
	
	void cambiarFormato24(boolean formato)
	{
		this.formato24=formato;
	}
	
	void tictac()
	{
		this.segundos++;
	}
	
	int comparar(Reloj otroReloj)
	{
		return Math.abs(otroReloj.segundos-this.segundos);
	}

}
