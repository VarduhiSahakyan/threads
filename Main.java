import java.util.Scanner;
// thread stops on console input << enter >>
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.stopThread();
        System.out.println(myThread.getState());

    }
}