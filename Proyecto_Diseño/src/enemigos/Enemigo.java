package enemigos;

import java.util.Random;

import combate.CombateComponente;
import combate.DecoradorAtaque;
import combate.DecoradorDefensa;
import estrategia.EstrategiaCombate;
import personajes.Jugador;
import personajes.Personaje;

public abstract class Enemigo extends Personaje
{

	protected String nombreHabilidadPrimaria = "";
	protected String nombreHabilidadSecundaria = "";
	
	public Enemigo(String nombre, int ataque, int defensa, int vidaMaxima, String nombreHabilidadPrimaria, String nombreHabilidadSecundaria)
	{
		super(nombre, ataque, defensa, vidaMaxima);
		this.nombreHabilidadPrimaria = nombreHabilidadPrimaria;
		this.nombreHabilidadSecundaria = nombreHabilidadSecundaria;
	}
	
	public void ejecutarAtaque(Jugador objetivo)
	{
		CombateComponente ataque = new CombateComponente();
		DecoradorDefensa defensaDecorada = new DecoradorDefensa(ataque);
		DecoradorAtaque ataqueDecorado = new DecoradorAtaque(defensaDecorada);
		
		ataqueDecorado.combate(this, objetivo);
	}
	
	public boolean habilidadIA() {
				
		Random rand = new Random();
		
		int intervaloDeValores = 1;
		int habilidad = rand.nextInt(intervaloDeValores);
		
		if(habilidad == 1) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public String getNombreHabilidadPrimaria() {
		return this.nombreHabilidadPrimaria;
	}
	
	public String getnombreHabilidadSecundaria() {
		return this.nombreHabilidadSecundaria;
	}
	
	// Patron Template
	public abstract void atacar(Jugador objetivo);
	
	// Lo ultimo si no da tiempo, las habilidades las llaman las estrategias NO el atacar
	public abstract void usarHabilidadPrimaria();
	
	public abstract void usarHabilidadSecundaria(Jugador objetivo);
	
	// Patron Strategy
	public void ejecutarStrategy(EstrategiaCombate estrategia, Personaje personajesJugador)
	{
		
		estrategia.ejecutar(personajesJugador);
		
	}


}
