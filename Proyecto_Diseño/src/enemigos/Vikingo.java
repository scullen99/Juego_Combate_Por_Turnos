package enemigos;

import combate.CalculadoraDa�o;
import estado.EstadoCongelado;
import personajes.Jugador;
import personajes.Personaje;

public class Vikingo extends Enemigo
{

	public Vikingo(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Recuperaci�n", "Hacha Congelada");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " la bendici�n que me di� Od�n me cura 30hp!");
        this.curar(30);
	

	}


	public void usarHabilidadSecundaria(Jugador objetivo) 
	{

		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.congelado() == true) {
		
			System.out.println(this.getNombre() + " lanz� un hacha congelada y congel� a " + objetivo.getNombre());
			objetivo.a�adirEstado(new EstadoCongelado(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " esquivaste el hacha!");
			
		}

	}


	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " Antes de entrar en un lugar, f�jate por d�nde se puede salir");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre() + "\n");
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
		
	}

}
