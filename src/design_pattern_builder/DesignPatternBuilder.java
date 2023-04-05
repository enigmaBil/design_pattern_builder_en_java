/**
 * 
 */
package design_pattern_builder;

/**
 * @author enigma
 *
 */
public class DesignPatternBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Barman barman = new Barman();
		JuiceBuilder juiceOrangeBuilder = new JuiceOrangeBuilder();
		JuiceBuilder juiceAnanasBuilder = new JuiceAnanasBuilder();
		JuiceBuilder juiceCitronBuilder = new JuicecitronBuilder();
		
		barman.setJuiceBuilder(juiceCitronBuilder);
		barman.constructJuice();
		
		Juice jusDeCitron = barman.getJuice();
		System.out.println(jusDeCitron);
		
		
		barman.setJuiceBuilder(juiceAnanasBuilder);
		barman.constructJuice();
		
		Juice jusDananas = barman.getJuice();
		System.out.println(jusDananas);
		
		barman.setJuiceBuilder(juiceOrangeBuilder);
		barman.constructJuice();
		
		Juice jusDorange = barman.getJuice();
		System.out.println(jusDorange);
	}

}
