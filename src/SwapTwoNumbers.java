public class SwapTwoNumbers {
    public void swapUsingThirdVariable(int x, int y){
        int z;
        System.out.println(String.format("Before: X=%s Y=%s",x,y));
        z = x;
        x = y;
        y = z;
        System.out.println(String.format("After: X=%s Y=%s",x,y));

    }

    public void swapUsingSameVariable(int x, int y) {
        System.out.println(String.format("Before: X=%s Y=%s",x,y));
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(String.format("After: X=%s Y=%s",x,y));

    }

    public static void main(String[] args) {
        SwapTwoNumbers s = new SwapTwoNumbers();
        s.swapUsingThirdVariable(2,3);
        s.swapUsingSameVariable(2,3);

    }
}
