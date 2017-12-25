/**
 * Created by nibesh on 4/8/17.
 */
public class Main {
    public static void main(String[] args) {

        MyRunnable obj1=new MyRunnable("nibesh");
        Thread t1=new Thread(obj1);
        t1.start();

        for (int j=0;j<10;j++) {
            System.out.println("the value of j in main= " + j);
        }

    }
}
