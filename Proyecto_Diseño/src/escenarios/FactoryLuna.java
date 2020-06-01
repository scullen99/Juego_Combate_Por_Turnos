package escenarios;

import enemigos.Homeopata;
import enemigos.Oso;
import enemigos.Terraplanista;
import enemigos.Twittero;
import enemigos.Vikingo;

public class FactoryLuna implements AbstractFactoryEnemigos {

	// Homeopata en la Luna
	public Homeopata getHomeopata()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Homeopata("Homeopata en la Luna", 5, 5, 100);
	}

    // Oso en la Luna
	public Oso getOso()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Oso("Oso Lunoso", 8, 12, 100);
	}

	// Terraplanista en la Luna
	public Terraplanista getTerraplanista()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Terraplanista("Terraplanista en la Luna", 6, 12, 100);
	}

    // Twittero en la Luna
	public Twittero getTwittero()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Twittero("Twittero en la Luna", 6, 8, 100);
	}

	// Vikingo en la Luna
	public Vikingo getVikingo()
	{
		/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
		return new Vikingo("Vikingo en la Luna", 10, 8, 100);
	}

}
