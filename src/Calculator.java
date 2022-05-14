import java.util.Scanner;

public class Calculator {
    public double add(double x, double y){
        return(x+y);
    }
    public double sub(double x, double y){
        return(x-y);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        Calculator c = new Calculator();
        double z = c.add(first,second);
        System.out.println(z);

        double a = c.sub(first,second);
        System.out.println(a);
    }

}
