package Reflection.Methodreflection;
import java.lang.reflect.*;

public class dog {
    public void breed(){
        System.out.println("labrador");
    }
    public void sound(){
        System.out.println("bark bark....");
    }
}
class Main{
    public static void main(String[] args) {
        dog d1=new dog();
        Class c=d1.getClass();
        Method[] methods=c.getDeclaredMethods();
        for(Method m:methods){
            String name =m.getName();   
            System.out.println("Name:"+name);
            int modifier=m.getModifiers();
            String mod=Modifier.toString(modifier);
            System.out.println("modifier:"+mod);
            System.out.println("returntype:"+m.getReturnType());
            System.out.println(" ");

        }

    }
}