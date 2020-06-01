package estrategia;

import enemigos.Enemigo;
import personajes.Jugador;
import personajes.Personaje;

public class EstrategiaDefensiva extends EstrategiaCombate
{

	public EstrategiaDefensiva(Enemigo componente)
	{
		super(componente);
	}


	public void ejecutar(Personaje jugador)
	{
		
		if(jugador.estaVivo()) {
			System.out.println(this.componente.getNombre() + " se prepara para atacar a " + jugador.getNombre());
			this.componente.atacar((Jugador) jugador);
			System.out.println(this.componente.getNombre() + " va a usar " + this.componente.getNombreHabilidadPrimaria());
			this.componente.usarHabilidadPrimaria();
		}
		

	}

}
