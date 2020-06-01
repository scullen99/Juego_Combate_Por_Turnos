package escenarios;

import enemigos.*;

public interface AbstractFactoryEnemigos
{
	public abstract Homeopata getHomeopata();
	public abstract Oso getOso();
	public abstract Terraplanista getTerraplanista();
	public abstract Twittero getTwittero();
	public abstract Vikingo getVikingo();
}
