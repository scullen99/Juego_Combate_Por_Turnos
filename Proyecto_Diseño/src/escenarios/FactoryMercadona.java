package escenarios;

import enemigos.Homeopata;
import enemigos.Oso;
import enemigos.Terraplanista;
import enemigos.Twittero;
import enemigos.Vikingo;

public class FactoryMercadona implements AbstractFactoryEnemigos
{

	    // Homeopata en el Mercadona
		public Homeopata getHomeopata()
		{
			/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
			return new Homeopata("Homeopata en el Mercadona", 5, 5, 100);
		}

		// Oso en la Mercadona
		public Oso getOso()
		{
			/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
			return new Oso("Oso gastoso", 8, 12, 100);
		}

		// Terraplanista en el Mercadona
	    public Terraplanista getTerraplanista()
		{
			/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
			return new Terraplanista("Terraplanista en el Mercadona", 6, 12, 100);
		}

		// Twittero en el Mercadona
	    public Twittero getTwittero()
		{
			/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
			return new Twittero("Twittero en el Mercadona", 6, 8, 100);	
		}

		// Vikingo en el Mercadona
		public Vikingo getVikingo()
		{
			/* Valores Ataque, Defensa y VidaMáxima están de placeholder */
			return new Vikingo("Vikingo en el Mercadona", 10, 8, 100);
		}
}
