package kk.practise.String类理解;

import java.lang.reflect.Field;

/**
 * @author kangkai on 2018/1/25.
 */
public class Demo04 {
    public static void main(String[] args) {
        String str = "1234";
        Field field = getField("java.lang.String","value");
        field.setAccessible(true);//不写报错：Demo04 cannot access a member of class java.lang.String
        // (in module java.base) with modifiers "private final"
        byte[] value = {};
        try {
            value = (byte[])field.get(str);
        }catch (Exception e) {
            e.printStackTrace();
        }
        value[0] = 'a';
        value[1] = 'b';
        System.out.println(str);
    }
    /**
     * Description:指定类名，指定属性名，获取属性
     * @param className,fieldName
     * @return field
     */
    public static Field getField(String className, String fieldName) {
        try {
            //获得类名
            Class c = Class.forName(className);
            //获得类对象
            Object object = c.getConstructor().newInstance();
            //获得指定属性
            Field field = object.getClass().getDeclaredField(fieldName);
            return field;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
