package hu.bme.iit.itlab1;

/**
 * A főosztály. Felépíti a grafikus felületet.
 * 
 * @author mamunga
 * 
 */
public class TreeTest {

	public static void main(String[] args) {
		FileWrap wrapper = new FileWrap("resources/lol.txt");
		System.out.println(wrapper.toString());

	}

}
