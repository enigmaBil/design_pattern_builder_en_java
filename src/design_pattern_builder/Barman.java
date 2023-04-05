/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 *
 */
public class Barman {

	private JuiceBuilder juiceBuilder;
	
	public void setJuiceBuilder(JuiceBuilder jb) {
		juiceBuilder = jb;
	}
	
	public Juice getJuice() {
		return juiceBuilder.getJuice();
	}
	
	public void constructJuice() {
		juiceBuilder.createNewJuiceProduct();
		juiceBuilder.buildFruts();
		juiceBuilder.buildIceCubeNbr();
	}
}
