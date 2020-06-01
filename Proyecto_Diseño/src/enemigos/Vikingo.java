package enemigos;

import combate.CalculadoraDa�o;
import estado.EstadoCongelado;
import personajes.Jugador;
import personajes.Personaje;

public class Vikingo extends Enemigo
{

	public Vikingo(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "AAAAAAAAAAAAAAAAAAAAAA", "WAAAAAAAAAAAAAGH");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " la bendicion que me dio odin me cura 10hp!");
        this.curar(10);
	

	}


	public void usarHabilidadSecundaria(Jugador objetivo) 
	{

		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.congelado() == true) {
		
			System.out.println(this.getNombre() + " lanzo un hacha congelada y congelo a " + objetivo.getNombre());
			objetivo.a�adirEstado(new EstadoCongelado(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " esquivaste el hacha!");
			
		}

	}


	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " jajajajaja soy Olaf que dicho al reves es Falo!");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre());
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
		
	}

}
