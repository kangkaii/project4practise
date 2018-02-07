package kk.practise.String类理解;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author kangkai on 2018/1/25.
 */
public class Demo03 {
    private static String a;
    //改变String对象的值
    public static void main(String[] args) {
        a = "abc";
//        getFieldNames("java.lang.String","hash");
        Field field = getField("java.lang.String","value");
//        Field[] fields = getFields("java.lang.String");
        field.setAccessible(true);
        //byte[] array = new byte[]{1,2,3,4,5,6};
        byte[] value = {};
        try{
            value = (byte[])field.get(a);
        }catch (Exception e) {
            e.printStackTrace();
        }
        value[1] = 'q';
        System.out.println(a);

    }

    /**
    * Description:指定类名，指定属性名，获取属性
    * @param className,fieldName
    * @return field
    */
    public static Field getField(String className,String fieldName) {
        /*try {
            //获得类名
            Class c = Class.forName(className);
            //获得类对象
            Object object = c.getConstructor().newInstance();
            //获得指定属性
            Field field = object.getClass().getDeclaredField(fieldName);
            return field;
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return null;
    }

    public static void getFieldNames(String className) {
        try {
            //获得类名
            Class c = Class.forName(className);
            //获得类对象
            Object object = c.getConstructor().newInstance();
            //获得指定名字的属性
            Field[] fields = object.getClass().getDeclaredFields();
            //field.setAccessible(true);
            for (int i = 0,size = fields.length; i < size; i++) {
                String fn = fields[i].getName();
                String ft = fields[i].getType().getName();
                System.out.println("该类的第"+(i+1)+"个属性的名字为："+fn+"，该属性的类型为："+ft
                        +"，该属性的修饰符为： "+ Modifier.toString(fields[i].getModifiers()));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获得本类属性的修饰符
    public void checkThisClassModifiers() {

        Class tc = this.getClass();
        Field fl[] = tc.getDeclaredFields();

        for(int i=0;i<fl.length;i++)
        {
            System.out.println("第"+(i+1)+"个属性的修饰符为："+ Modifier.toString(fl[i].getModifiers()));
        }

    }

}
