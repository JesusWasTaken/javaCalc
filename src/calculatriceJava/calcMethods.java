package calculatriceJava;
import javax.swing.JTextArea;

public class calcMethods {

	public static String rawEntry = "";
	public static float previous = 0;
	public static String savedOperation = "";
	public static JTextArea output = CalcUI.area;
	public static boolean dotPressed = false;
	public static boolean isNegative = false;
	
	public static void input(String s) {
		rawEntry += s;
		output.setText(rawEntry);
	}
	
	public static void addDot() {
		if(dotPressed == false) {
			rawEntry = rawEntry+".";
			output.setText(rawEntry);
			dotPressed = true;
		}
	}
	
	public static void operator(String operation ) {
		if (rawEntry != "" && savedOperation == "") {
			try {
				savedOperation = operation;
				output.setText(operation);
				previous = Float.valueOf(rawEntry);
				resetBooleans();	
			} catch (Exception e) {
				System.err.println(e);
			}
		} else {
			output.setText("ERROR : please enter a number first");
		}
	}
	
	public static void calculate() {
		if (rawEntry == "") {
			output.setText("ERROR : please enter a number first");
		} else {
			float answer = 0;
			float operand = Float.valueOf(rawEntry);
			
			switch(savedOperation) {
			case "-":
				answer = previous - operand;
				break;
			case "+":
				answer = previous + operand;
				break;
			case "/":
				if (operand == 0) {
					output.setText("Divison by 0 is not possible");
					break;
				} else {
					answer = previous / operand;
					break;
				}
			case "*":
				answer = previous * operand;
				break;
			default :
				answer = operand;
			}
			
			previous = answer;
			String print = String.valueOf(answer);
			if (print.substring(print.length()-2).equals(".0")) {
				print = print.substring(0,print.length()-2);
			}
			output.setText(print);
			resetBooleans();
		}
	}
	
	public static void reset() {
		previous = 0;
		savedOperation = "";
		output.setText("");
		resetBooleans();
	}
	
	public static void del() {
		if(rawEntry.length()>0) {
			if(rawEntry.substring(rawEntry.length()-1).equals(".")) {
				dotPressed = false;
			}
			if (rawEntry.length() == 1) {
				rawEntry = "";
			} else  {
				rawEntry = rawEntry.substring(0,rawEntry.length()-1);
			}
			output.setText(rawEntry);
		}
	}
	
	public static void delCurr() {
		resetBooleans();
		output.setText(rawEntry);
	}
	
	public static void negative() {
		if(rawEntry.substring(0,1).equals("-")) {
			rawEntry = rawEntry.substring(1);
		} else {
			rawEntry = "-"+rawEntry;
		}
		output.setText(rawEntry);
	}
	
	public static void resetBooleans() {
		isNegative = false;
		dotPressed = false;
		rawEntry = "";
	}
}
