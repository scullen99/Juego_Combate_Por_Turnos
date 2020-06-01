package escenarios;

import enemigos.Homeopata;
import enemigos.Oso;
import enemigos.Terraplanista;
import enemigos.Twittero;
import enemigos.Vikingo;

public class FactoryDesierto implements AbstractFactoryEnemigos {

	// Homeopata en el Desierto
	public Homeopata getHomeopata()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Homeopata("Homeopata en el desierto", 5, 5, 100);
	}

	// Oso en el Desierto
	public Oso getOso()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Oso("Oso Caluroso", 8, 12, 100);
	}

    // Terraplanista en el Desierto
	public Terraplanista getTerraplanista()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Terraplanista("Terraplanista en el desierto", 6, 12, 100);
	}

    // Twittero en el Desierto
	public Twittero getTwittero()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Twittero("Twittero en el desierto", 6, 8, 100);
		
	}

    // Vikingo en el Desierto
	public Vikingo getVikingo()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Vikingo("Vikingo en el desierto", 10, 8, 100);
	}

}
