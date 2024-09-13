public class fourthprogram {

    public static void main(String[] args) {    
        one obj = new one();
        obj.m1();
        two obj1 = new two();
        obj1.m1();
    }
    
}
class one{
    void m1(){
        for(int i=0;i<5;i++){
            System.out.println("friday");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class two{
    void m1(){
        for(int i=0;i<5;i++){
            System.out.println("sunday");

        }
    }
}
