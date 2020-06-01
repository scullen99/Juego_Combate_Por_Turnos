package enemigos;

import combate.CalculadoraDaño;
import estado.EstadoDesorientado;
import personajes.Jugador;
import personajes.Personaje;

public class Terraplanista extends Enemigo
{

	public Terraplanista(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "La vuelta al mundo xd", "El articulo que he leido en Facebook");
	}


	public void usarHabilidadPrimaria()
	{
		System.out.println(this.getNombre() + " dio la vuelta al mundo y probo una comida que le curó 10hp!");
		this.curar(10);
		
	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
		
		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.desorientado() == true) {
			
			System.out.println(this.getNombre() + " uso argumentos validos para confudir y estas desorientado!");
			objetivo.añadirEstado(new EstadoDesorientado(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " uso argumentos pero penso que la tierra era redonda!");
			
		}
		
	}


	public void atacar(Jugador objetivo)
	{
		
        System.out.println(this.getNombre() + " te lanzo una piedra chacho que tu cabeza será plana tambien!");
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre());
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		   
        
	}

}
