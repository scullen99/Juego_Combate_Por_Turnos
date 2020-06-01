package enemigos;

import personajes.Jugador;
import personajes.Personaje;
import combate.CalculadoraDaño;
import estado.EstadoEnvenenado;

public class Homeopata extends Enemigo
{

	public Homeopata(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Jeringuillazo", "Ataque venenoso illuminati");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " se mete un jeringuillazo y se cura 8 hp!");	
		this.curar(8);

	}

	public void usarHabilidadSecundaria(Jugador objetivo)
	{        
		
		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.envenenado() == true) {
			
			System.out.println(this.getNombre() + " envenena a " + objetivo.getNombre());
			objetivo.añadirEstado(new EstadoEnvenenado(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " no pudo lanzar su veneno!");
			
		}
        
		
	}


	public void atacar(Jugador objetivo)
    {
		
        System.out.println(this.getNombre() + " las vacunas causan autismo pero no tanto como el que tengo yo!");
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre());
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		   

    }

}
