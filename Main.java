

public class Main {
    public static  void main(String[] args) {
        //Iterative
        long startTime;
        long endTime;
        long completed;

        startTime = System.nanoTime();
        iterative(5);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("Iterative 5: time " + completed);

        startTime = System.nanoTime();
        iterative(10);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("Iterative 10: time " + completed);

        startTime = System.nanoTime();
        iterative(15);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("Iterative 15: time " + completed);

        startTime = System.nanoTime();
        iterative(20);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("Iterative 20: time " + completed);

        System.out.println("");

        //recursive
        startTime = System.nanoTime();
        recursive(5);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("recursive 5: time " + completed);

        startTime = System.nanoTime();
        recursive(10);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("recursive 10: time " + completed);

        startTime = System.nanoTime();
        recursive(15);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("recursive 15: time " + completed);

        startTime = System.nanoTime();
        recursive(20);
        endTime = System.nanoTime();
        completed = endTime - startTime;
        System.out.println("recursive 20: time " + completed);



    }

    //O(2^n)
    public static int iterative(int n) {
        if (n <= 1) {
            return n;
        }
        int current = 1;
        int prev = 1;

        for (int i = 2; i < n; i++) {
            int temp = current;
            current += prev;
            prev = temp;
        }
        return current;
    }
    //O(2^n)
    public static int recursive(int n) {
        if(n <= 1) {
            return n;
        }
        return recursive(n-1) + recursive(n-2);
    }
}
