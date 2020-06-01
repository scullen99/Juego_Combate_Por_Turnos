package enemigos;

import combate.CalculadoraDaño;
import estado.EstadoSangrando;
import personajes.Jugador;
import personajes.Personaje;

public class Oso extends Enemigo
{

	public Oso(String nombre, int ataque, int defensa, int vidaMaxima)
	{
		super(nombre, ataque, defensa, vidaMaxima, "Hibernacion levitante", "Zarpazo");
	}


	public void usarHabilidadPrimaria()
	{
		
		System.out.println(this.getNombre() + " hiberno 8 horas y se curo 5hp");
        this.curar(5);

	}


	public void usarHabilidadSecundaria(Jugador objetivo)
	{
		
		CalculadoraDaño probabilidadEstado = new CalculadoraDaño();
		
		if(probabilidadEstado.sangrado() == true) {
			
			System.out.println(this.getNombre() + " hace sangrar a " + objetivo.getNombre());
			objetivo.añadirEstado(new EstadoSangrando(objetivo));
			
		}
		else {
			
			System.out.println(this.getNombre() + " hizo un mal movimiento y lo esquivaste!");
			
		}
		
	}


	public void atacar(Jugador objetivo)
	{
		
        System.out.println("Te meto un zarpazo y no vuelves!");  
        int daño = Personaje.calc.calcularDaño(this, objetivo);
        
        System.out.println(this.getNombre() + " hace " + String.valueOf(daño) + " daño a " + objetivo.getNombre());
        objetivo.dañar(daño);
		System.out.println(objetivo.getNombre() + " le queda " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + " hp"); 
		
	}

}
