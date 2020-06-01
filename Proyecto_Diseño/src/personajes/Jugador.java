package personajes;

import combate.CombateComponente;
import combate.DecoradorAtaque;
import combate.DecoradorDefensa;
import enemigos.Enemigo;

public class Jugador extends Personaje
{

	public Jugador(String nombre, int ataque, int defensa, int vida)
	{
		super(nombre, ataque, defensa, vida);
	}

	public void atacar(Enemigo objetivo)
	{
		CombateComponente ataque = new CombateComponente();
		DecoradorDefensa defensa_decorada = new DecoradorDefensa(ataque);
		DecoradorAtaque ataque_decorado = new DecoradorAtaque(defensa_decorada);
		
		ataque_decorado.combate(this, objetivo);
	}
	
}
