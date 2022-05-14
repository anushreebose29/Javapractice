public class EvenOdd {
    public String evenOrOdd(int x){
        String type;
        if (x % 2 == 0){
            type = "even";
        }else {
            type = "odd";

        }
        return type;
    }

    public static void main(String[] args) {
        EvenOdd ans = new EvenOdd();
        String value = ans.evenOrOdd(5);
        System.out.println(value);
        System.out.println(ans.evenOrOdd(6));
        System.out.println(ans.evenOrOdd(7));
        System.out.println(ans.evenOrOdd(8));

    }
}
