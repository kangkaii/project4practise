package kk.practice.java实现去重;import java.util.Objects;/**user类 * 以id为唯一标识 * @author kangkai on 2018/4/12. */public class User0412 {    private Integer id;    private String name;    public User0412(Integer id, String name) {        this.id = id;        this.name = name;    }    //重写 equals()    @Override    public boolean equals(Object o) {        if (this == o) {            return true;        }        if (o == null || getClass() != o.getClass()) {            return false;        }        User0412 user0412 = (User0412) o;        //return this.id == user0412.id;        return Objects.equals(id, user0412.id);    }    //重写 hashCode()    @Override    public int hashCode() {        return Objects.hash(id);    }    @Override    public String toString() {        return "User0412{" +                "id=" + id +                ", name='" + name + '\'' +                '}';    }}