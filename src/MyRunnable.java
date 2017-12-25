/**
 * Created by nibesh on 4/8/17.
 */
public class MyRunnable implements Runnable {

    String name;
    public MyRunnable(String name){
        this.name=name;
    }


    @Override
   synchronized public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("value of i in= "+this.name);
            try {
                MyThread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
