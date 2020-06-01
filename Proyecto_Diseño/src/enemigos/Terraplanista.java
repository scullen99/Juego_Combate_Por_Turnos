package enemigos;

import combate.CalculadoraDaño;
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
		System.out.println(this.getNombre() + " dió la vuelta al mundo y probó una comida que le curó 10hp!");
		this.curar(10);
		
	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
		
		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.desorientado() == true) {
			
			System.out.println(this.getNombre() + " usó argumentos poco válidos para confudir y estás desorientado!");
			objetivo.añadirEstado(new EstadoDesorientado(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " usó argumentos illuminati y pensó que la tierra era redonda!");
			
		}
		
	}


	public void atacar(Jugador objetivo)
	{
		
        System.out.println(this.getNombre() + "Tengo pruebas, me he visto todos los vídeos de Oliver Ibáñez!!!!!!");
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre() + "\n");
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		   
        
	}

}
