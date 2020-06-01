package estrategia;

import enemigos.Enemigo;
import personajes.Jugador;
import personajes.Personaje;

public class EstrategiaOfensiva extends EstrategiaCombate
{

	public EstrategiaOfensiva(Enemigo componente)
	{
		super(componente);
	}

	public void ejecutar(Personaje jugador)
	{
		if(jugador.estaVivo()) {
			System.out.println(this.componente.getNombre() + " se prepara para atacar a " + jugador.getNombre());
			this.componente.atacar((Jugador) jugador);
			System.out.println(this.componente.getNombre() + " va a usar " + this.componente.getnombreHabilidadSecundaria());
			this.componente.usarHabilidadSecundaria((Jugador) jugador);
		}
		
	}

}
