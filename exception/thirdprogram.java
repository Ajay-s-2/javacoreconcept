// throw error example program
public class thirdprogram
{ // maually throw exception(user create the exception)
    void find (int s){
        if (s<10){
            throw new ArithmeticException("value is less than 10");
        }
        else{
            System.out.println("value is greater than 10");
        }
    }
    public static void main(String[] args)
    { // handle the exception(throw error example program)
        try{
            thirdprogram obj = new thirdprogram();
            obj.find(5);

        }
        catch(ArithmeticException e){
            System.out.println(e);
    }
}
 }