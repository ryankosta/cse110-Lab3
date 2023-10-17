public class App {
    public static void main(String[] args) throws Exception {
	    display("this is my display");
    }
    public static void display(String message) {
	    String border = "";
	    for (int i = 0; i < message.length() + 4; i++) {
		    border += "-";
	    }
	    System.out.println(border + "\n"
		+ "| " + message + " |\n" + border);
    }
}
