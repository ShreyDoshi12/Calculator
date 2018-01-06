
package calculator;

/**
 *
 * @author shrey
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double fNum , sNum , answer;
        System.out.println("Enter the first number : ");
        fNum = scan.nextDouble();
        System.out.println("Enter the second number : ");
        sNum = scan.nextDouble();
        answer = fNum + sNum;
        System.out.println("Your answer is : " + answer);
    }
    
}
