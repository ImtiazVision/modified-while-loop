import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String input = " " ;
	  while ( !input.equals("quit")) {
		  System.out.println("Input: ");
		  input = scanner.next().toLowerCase();
		  System.out.println(input);
	  }
    
  }
}