package enemigos;

import combate.CalculadoraDaño;
import estado.EstadoArdiendo;
import personajes.Jugador;
import personajes.Personaje;

public class Twittero extends Enemigo
{

	public Twittero(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Silbido", "Fav si te vienes");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " recibio el seguimiento de eldandydebarcelona y se cura 8hp!");
        this.curar(8);

	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
	
		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.ardiendo() == true) {
		
			System.out.println(this.getNombre() + " mando un privado to flama a " + objetivo.getNombre());
			objetivo.añadirEstado(new EstadoArdiendo(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " se confudio de perfil y fallo el ataque!");
			
		}

	}



	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " mi último twit ha tenido 3000 impresiones y 20 likes!");
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre());
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
	}

}
