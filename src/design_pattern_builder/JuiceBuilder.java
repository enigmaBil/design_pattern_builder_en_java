/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 * 
 */
public abstract class JuiceBuilder {

	protected Juice juice;
	
	public Juice getJuice() {
		return juice;
	}
	
	public void createNewJuiceProduct() {
		juice = new Juice();
	}
	
	public abstract void buildFruts();
	public abstract void buildIceCubeNbr();
}
