package lambdas.timsLambdas;

// Every LAMBDA EXPRESSION has 3 parts:

// 1. Arguments list
// 2. Arrow token: '->'
// 3. The body

// LAMBDAs can be only used for functional interfaces, i.e., interfaces having either 1 method only
// OR 1 method + n default methods. Lambdas help reduce the amount of code.

public class LabddasIntro {

    public static void main(String[] args) {

        // Method 1: using the lambda expression:
        new Thread(()->System.out.println("Printing from the Runnable - Method 1")).start();

        // In cases where multiple lines of code need to be added inside the method:
        new Thread(()-> {
            System.out.println("Printing from the Runnable - extended Method 1");
            System.out.println("Line 2");
            System.out.format("This is line %d\n",3);

        }).start();

        // Method 2: using an anonymous class to start a new Thread:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable - Method 2");
            }
        }).start();

        // Method 3: longer way of starting a new thread involves running
        // the following code in the main method:
        new Thread(new CodeToRun()).start();
        // and executing the code for the 'CodeToRun' class below.
    }
}

// Declaring an instance of the Runnable interface:
class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the Runnable - Method 3");
    }
}
