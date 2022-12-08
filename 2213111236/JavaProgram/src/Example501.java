import java.text.*;

public class Example501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatNumber(500));
		System.out.println(formatNumber('a'));
		System.out.println(formatNumber(98.9934));
		System.out.println(formatNumber("550"));
		String strNum = "550";
		System.out.println(strNum);

	}
	private static String formatNumber(int value) {
		return String.format("%d", value);
	}
	private static String formatNumber(double value) {
		return String.format("%.3f", value);
	}
	private static String formatNumber(String value) {
		return String.format("%.3f", Double.parseDouble(value));
	}

}
