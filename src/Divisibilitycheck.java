public class Divisibilitycheck {
    public static boolean divisibilityCheck(int number, int divisor){
        if(number % divisor == 0){return true;}
        else{return false;}
    }

    public static void main(String[] args) {

        boolean value = Divisibilitycheck.divisibilityCheck(15, 5);
        System.out.println(value);
        System.out.println(Divisibilitycheck.divisibilityCheck(9,3));
        System.out.println(Divisibilitycheck.divisibilityCheck(9,5));

    }
}
