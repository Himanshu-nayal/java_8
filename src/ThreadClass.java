public class ThreadClass {

        public static void main(String[] args) {

             new Thread(() -> System.out.println("thread using Lambda.")).start();
        }
    }

