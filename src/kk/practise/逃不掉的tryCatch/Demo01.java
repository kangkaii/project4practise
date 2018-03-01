package kk.practise.逃不掉的tryCatch;

/**
 * @author kangkai on 2018/2/27.
 */
public class Demo01 {
    public static void main(String[] args){
        Demo01 c = new Demo01();
        c.method();
    }

    public void method(){
        try{
            System.out.println("A");
            int i = 10 / 0;
            System.out.println("B");
        }catch(Exception e){
            System.out.println("C");
        }finally{
            System.out.println("D");
        }
    }
}

