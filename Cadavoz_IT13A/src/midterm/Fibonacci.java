package midterm;

public class Fibonacci {
    
    public static void main(String[] args){
        int a = 10;
        System.out.print("Fibonacci Sequence of " + a + ": ");
        for (int c = 0; c < a; c++){
            System.out.print(fibonacci(c) + ", ");
        }
    }
    
    public static int fibonacci(int a){
        if (a <= 1){
            return a;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}
