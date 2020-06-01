package enemigos;

import combate.CalculadoraDaño;
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
		
		System.out.println(this.getNombre() + " recibió una validación social y se ha curado 15hp!");
        this.curar(15);

	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
	
		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.ardiendo() == true) {
		
			System.out.println(this.getNombre() + " mandó un mensaje directo poco deseable a " + objetivo.getNombre());
			objetivo.añadirEstado(new EstadoArdiendo(objetivo));
		
		}
		else {
			
			System.out.println(this.getNombre() + " se confudió de perfil y falló el ataque!");
			
		}

	}



	public void atacar(Jugador objetivo)
	{

        System.out.println(this.getNombre() + " mi último twit ha tenido 16 favs!");
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre() + "\n");
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		    
		
	}

}
