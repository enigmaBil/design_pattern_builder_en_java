/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 *
 */
public class JuiceAnanasBuilder extends JuiceBuilder {

	public void buildFruts() {
		juice.setFruts("Ananas");
	}
	
	public void buildIceCubeNbr() {
		juice.setIceCubeNbr(4);
	}
}
