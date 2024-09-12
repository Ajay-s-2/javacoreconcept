package javacoreconcept.inheratence;
import java.util.*;
class singleinhertancel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        child obj=new child();
        obj.sum(10,5);
        obj.sub(10,5);

    }
}
class add{
    void sum(int a,int b){
        System.out.println(a+b);
    }
}
class child extends add{
    void sub(int a,int b){
        System.out.println(a-b);
    }
}