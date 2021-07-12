package Reflection;


import java.lang.reflect.*;
public class Student{
    private int rollno;
    private String Name;
    public void setrollno(int no){
        this.rollno=no;
    }
    public void setname(String name){
        this.Name=name;
    }
    public int getrollno(){
        return rollno;
    }
    public String getname(){
        return Name;
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.setrollno(1);
        s.setname("karthi");
       Class c=s.getClass();
       Field[] field=c.getDeclaredFields();
       for(Field f:field){
           f.setAccessible(true);
           String name=f.getName();
           System.out.println("FieldName: "+name);
           int modifier=c.getModifiers();
           String mod=Modifier.toString(modifier);
           System.out.println("Modifier: "+mod);
           System.out.println(" ");
           
       }
       Method[] method=c.getDeclaredMethods();
       for(Method m:method){
        
        String name=m.getName();
        System.out.println("MethodName: "+name);
        int modifier=c.getModifiers();
        String mod=Modifier.toString(modifier);
        System.out.println("Modifier: "+mod);
        System.out.println("Returntype: "+m.getReturnType());
        System.out.println(" ");
     }

  }
}

