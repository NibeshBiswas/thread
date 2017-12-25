/**
 * Created by nibesh on 4/8/17.
 */
public class Exception extends Thread{
    public static void main(String[] args) {

        int i=5,j=2;
        float result;

        try{
            result=(float)i/j;
            System.out.println("result= "+result);
            //System.out.println("Inside try blok");
        }
        catch (java.lang.Exception e) {
            System.out.println("exception found");
        }
        finally {
            System.out.println("Inside finally blok");

        }
    }
}
