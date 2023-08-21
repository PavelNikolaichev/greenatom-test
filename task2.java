public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
