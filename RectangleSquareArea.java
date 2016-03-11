import java.util.Scanner;
public class RectangleSquareArea{
	public static void main(String[] args) 
	  {

	Scanner newScanx =  new Scanner(System.in);
	Scanner newScany =  new Scanner(System.in);
	Scanner newScanl =  new Scanner(System.in);


	//System.out.println("Enter x:");
	//String x2 = newScanx.nextLine();
	//System.out.println("Enter y:");
	//String y2 = newScany.nextLine();
	System.out.println("Enter length:");
	String l2 = newScanl.nextLine();

	//int x = Integer.parseInt(x2);
	//int y = Integer.parseInt(y2);
	int length = Integer.parseInt(l2);

	  Square sq = new Square(length); 
	  System.out.println(sq.getArea()); 

	  }
}


