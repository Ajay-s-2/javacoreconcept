public class secondprogram {
    public static void main(String[] args){
        String s = null;
        try{
            int c= s.length();
            System.out.println(c);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
    
}
