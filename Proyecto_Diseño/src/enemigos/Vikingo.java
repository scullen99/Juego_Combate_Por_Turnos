package enemigos;

import combate.CalculadoraDaño;
import estado.EstadoCongelado;
import personajes.Jugador;
import personajes.Personaje;

public class Vikingo extends Enemigo
{

	public Vikingo(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Recuperación", "Hacha Congelada");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " la bendición que me dió Odín me cura 30hp!");
        this.curar(30);
	

	}


	public void usarHabilidadSecundaria(Jugador objetivo) 
	{

		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.congelado() == true) {
		
			System.out.println(this.getNombre() + " lanzó un hacha congelada y congeló a " + objetivo.getNombre());
			objetivo.añadirEstado(new EstadoCongelado(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " esquivaste el hacha!");
			
		}

	}


	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " Antes de entrar en un lugar, fíjate por dónde se puede salir");
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre() + "\n");
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
		
	}

}
