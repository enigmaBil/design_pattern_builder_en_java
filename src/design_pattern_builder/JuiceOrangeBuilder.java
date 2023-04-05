/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 *
 */
public class JuiceOrangeBuilder extends JuiceBuilder {

	public void buildFruts() {
		juice.setFruts("Orange");
	}
	
	public void buildIceCubeNbr() {
		juice.setIceCubeNbr(2);
	}
}
