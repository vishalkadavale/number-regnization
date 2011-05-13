package convolutional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Convolutional cn = new Convolutional();
		cn.getNN().load("5000.nn");
		ConvolutionalTester.test(cn, 1);
	}
}
