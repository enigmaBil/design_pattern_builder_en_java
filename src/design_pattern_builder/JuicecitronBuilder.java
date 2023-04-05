/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 *
 */
public class JuicecitronBuilder extends JuiceBuilder {

	public void buildFruts() {
		juice.setFruts("Citron");
	}
	
	public void buildIceCubeNbr() {
		juice.setIceCubeNbr(3);
	}
}
