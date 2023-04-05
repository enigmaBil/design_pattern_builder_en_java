/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 * creation de la classe produit celle que l'on creera par 
 * la suite
 */
public class Juice {
	
	
	private String fruts;
	private Integer iceCubeNbr;
	
	
	public void setFruts(String fruts) {
		this.fruts = fruts;
	}
	
	public void setIceCubeNbr(Integer iceCubeNbr) {
		this.iceCubeNbr = iceCubeNbr;
	}
	
	@Override
	public String toString() {
		return "Juice [fruts=" + fruts + ", iceCubeNbr=" + iceCubeNbr + "]";
	}
}
