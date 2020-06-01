package enemigos;

import combate.CalculadoraDa�o;
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
	
		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.ardiendo() == true) {
		
			System.out.println(this.getNombre() + " mando un privado to flama a " + objetivo.getNombre());
			objetivo.a�adirEstado(new EstadoArdiendo(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " se confudio de perfil y fallo el ataque!");
			
		}

	}



	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " mi �ltimo twit ha tenido 3000 impresiones y 20 likes!");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre());
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
	}

}
