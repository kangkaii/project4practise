package kk.practise.深复制与浅复制.再次测试18_03_05;

import java.io.*;

/**本例说明：
 * 说了那么多 深拷贝可以用实现 Serializable
 * 到底怎么实现
 * 写入流中，再取出。
 * 改变取出之后的对象的属性，被写入的对象值不变
 * @author kangkai on 2018/3/16.
 */
public class Demo02 {
    public static void main(String[] args) {
        Address01 address01 = new Address01("a省","a市");
        Student01 s1 = new Student01("小明",address01);
        try {
            // output
            ByteArrayOutputStream buf =
                    new ByteArrayOutputStream();
            ObjectOutputStream o =
                    new ObjectOutputStream(buf);
            o.writeObject(s1);
            // input
            ObjectInputStream in =
                    new ObjectInputStream(
                            new ByteArrayInputStream(
                                    buf.toByteArray()));
            Student01 s2 = (Student01)in.readObject();
            System.out.println(s1);
            s2.setName("小红");
            s2.getAddress01().setCity("b市");
            System.out.println(s1);
            System.out.println(s2);
        }catch (IOException e) {

        }catch (ClassNotFoundException e) {

        }

    }





}
class Student01 implements Serializable {

    String name;

    Address01 address01;

    public Student01() {
    }

    public Student01(String name, Address01 address01) {
        this.name = name;
        this.address01 = address01;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address01 getAddress01() {
        return address01;
    }

    public void setAddress01(Address01 address01) {
        this.address01 = address01;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name = '" + name + '\'' +
                ", provice = " + address01.province +
                ", city = " + address01.city +
                '}';
    }
}

class Address01 implements Serializable{

    transient String province;

    String city;

    public Address01(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




}

