package enemigos;

import personajes.Jugador;
import personajes.Personaje;
import combate.CalculadoraDa�o;
import estado.EstadoEnvenenado;

public class Homeopata extends Enemigo
{

	public Homeopata(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Psicof�rmacos", "Ataque venenoso illuminati");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " se toma unas pastillas no muy fiables y se cura 1 hp!");	
		this.curar(1);

	}

	public void usarHabilidadSecundaria(Jugador objetivo)
	{        
		
		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.envenenado() == true) {
			
			System.out.println(this.getNombre() + " envenena a " + objetivo.getNombre());
			objetivo.a�adirEstado(new EstadoEnvenenado(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " no pudo lanzar su veneno!");
			
		}
        
		
	}


	public void atacar(Jugador objetivo)
    {
		
        System.out.println(this.getNombre() + "Home�pata: Las vacunas causan autismo pero no tanto como el que tengo yo!");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre() + "\n");
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		   

    }

}
