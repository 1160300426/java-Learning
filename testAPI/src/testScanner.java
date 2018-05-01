import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);  
	      System.out.println("ÇëÊäÈë×Ö·û´®£º");  
	      while(true) {  
	          String lin = s.nextLine();  
	          if(lin.equals("exit")) break;  
	          System.out.println(">>>" + lin);  
	      }  
	}

}
