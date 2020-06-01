package enemigos;

import combate.CalculadoraDa�o;
import estado.EstadoDesorientado;
import personajes.Jugador;
import personajes.Personaje;

public class Terraplanista extends Enemigo
{

	public Terraplanista(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "La vuelta al mundo", "El Fakenew");
	}


	public void usarHabilidadPrimaria()
	{
		System.out.println(this.getNombre() + " di� la vuelta al mundo y prob� una comida que le cur� 10hp!");
		this.curar(10);
		
	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
		
		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.desorientado() == true) {
			
			System.out.println(this.getNombre() + " us� argumentos poco v�lidos para confudir y est�s desorientado!");
			objetivo.a�adirEstado(new EstadoDesorientado(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " us� argumentos illuminati y pens� que la tierra era redonda!");
			
		}
		
	}


	public void atacar(Jugador objetivo)
	{
		
        System.out.println(this.getNombre() + "Tengo pruebas, me he visto todos los v�deos de Oliver Ib��ez!!!!!!");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre() + "\n");
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		   
        
	}

}
