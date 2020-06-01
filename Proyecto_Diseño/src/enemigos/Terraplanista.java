package enemigos;

import combate.CalculadoraDa�o;
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
		System.out.println(this.getNombre() + " dio la vuelta al mundo y probo una comida que le cur� 10hp!");
		this.curar(10);
		
	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
		
		CalculadoraDa�o probabilidadEstado = new CalculadoraDa�o();
		
		if(probabilidadEstado.desorientado() == true) {
			
			System.out.println(this.getNombre() + " uso argumentos validos para confudir y estas desorientado!");
			objetivo.a�adirEstado(new EstadoDesorientado(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " uso argumentos pero penso que la tierra era redonda!");
			
		}
		
	}


	public void atacar(Jugador objetivo)
	{
		
        System.out.println(this.getNombre() + " te lanzo una piedra chacho que tu cabeza ser� plana tambien!");
        int da�o = Personaje.calc.calcularDa�o(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + objetivo.getNombre());
        objetivo.da�ar(da�o);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		   
        
	}

}
