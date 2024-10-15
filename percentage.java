#percentage
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter max marks");
        float total = sc.nextFloat();
        System.out.println("enter 1 marks");
        float a = sc.nextFloat();
        System.out.println("enter 2 marks");
        float b = sc.nextFloat();
        System.out.println("enter 3 marks");
        float c = sc.nextFloat();
        float per = (a+b+c)/total*100;
        System.out.println(per);
    }
}
