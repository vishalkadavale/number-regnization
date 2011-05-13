package convolutional;

public class ConTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Convolutional cn = new Convolutional();
		cn.getNN().load("60000_9.nn");
		ConvolutionalTester.test(cn, 10000);
	}

}
