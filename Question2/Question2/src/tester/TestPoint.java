package tester;
import com.geometry.Point2D;

import java.util.Iterator;
import java.util.Scanner;

import org.graalvm.compiler.lir.StandardOp.ImplicitNullCheck;

class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D[] array = new Point2D[10];
        for(Point2D ePoint2d : array) {
        	System.out.println(ePoint2d);
        }
        
        while(true) {
        	System.out.println("1.Plot a new point Input should be - index x-coordinate y-coordinate");
        	System.out.println("2.Display all the point");
        	System.out.println("3.Test equality of 2 point");
        	System.out.println("4.Calculate distance between two point");
        	System.out.println("10.Exit");
        	System.out.println("Enter the choose");
        	switch (scanner.nextInt()) {
			case 1:
				
				int index = scanner.nextInt();
				if(index>=0&&index<=9&&array[index]==null) {
					int x = scanner.nextInt();
					int y = scanner.nextInt();
					Point2D point2d = new Point2D(x, y);
					array[index] = point2d;
					for(Point2D ePoint2d : array) {
			        	System.out.println(ePoint2d);
			        }
				}
				else {
					System.err.println("Invalid index - out of range or index is occupied");
				}
				
				break;
			case 2:
				for(Point2D e : array) {
					if(e!=null)
						System.out.println(e.getDetails());
				}
				
					break;
			case 3:
				System.out.println("Enter the first index");
				int index1 = scanner.nextInt();
				System.out.println("Enter the second index");
				int index2 = scanner.nextInt();
				if(array[index1]==null || array[index2]==null) {
					System.err.println("No point ploted here");
				}
				else {
					System.out.println(array[index1].isEqual(array[index2]));
				}
				break;
			case 4:
				System.out.println("Enter the index of points between whom the distance is to be calculated");
				int ind1=scanner.nextInt();
				int ind2=scanner.nextInt();
				if (array[ind1]==null || array[ind2]==null) {
					System.err.println("No point ploted here");	
				}
				else {
					array[ind1].calculateDistance(array[ind2]);
				}
				break;
			default:
			case 10:
				System.exit(0);
				break;
			}
        	
        	
        }
        

    }    
}
