package kk.practise.测试下工具类;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;

/**
 * @author kangkai on 2018/3/9.
 */
public class Demo01 {
    public static void main(String[] args) {
         String s = " dasda ";
        if (StringUtils.isBlank(s)) {
            System.out.println("空");
        }else {
            System.out.println("非空");
        }

        Field field = FieldUtils.getField(String.class,"value",true);
        //Field field01 = getField("java.lang.String","value");
        byte[] value = {};
        try {
            value = (byte[])field.get(s);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //field.setAccessible(true);
        value[0] = 'q';
        System.out.println(s);
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
