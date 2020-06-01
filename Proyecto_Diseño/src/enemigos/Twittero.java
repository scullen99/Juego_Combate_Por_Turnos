package enemigos;

import combate.CalculadoraDa�o;
import estado.EstadoArdiendo;
import personajes.Jugador;
import personajes.Personaje;

public class Twittero extends Enemigo
{

	public Twittero(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Hastag", "Sociedad");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " recibi� una validaci�n social y se ha curado 15hp!");
        this.curar(15);

	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
	
		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.ardiendo() == true) {
		
			System.out.println(this.getNombre() + " mand� un mensaje directo poco deseable a " + objetivo.getNombre());
			objetivo.a�adirEstado(new EstadoArdiendo(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " se confudi� de perfil y fall� el ataque!");
			
		}

	}



	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " mi �ltimo twit ha tenido 16 favs!");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre() + "\n");
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
	}

}
