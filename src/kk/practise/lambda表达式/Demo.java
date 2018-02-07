package kk.practise.lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author kangkai on 2018/1/8.
 */
public class Demo {

    public static void main(String[] args) {
        Dog d1 = new Dog("d1",10,30);
        Dog d2 = new Dog("d2",20,20);
        Dog d3 = new Dog("d3",30,10);
        Dog[] array = new Dog[]{d1,d2,d3};
        Arrays.sort(array, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 0;
            }
        });
        //Arrays.sort(array,(o1, o2) -> { o1.height - o2.height});
        //Arrays.sort(array, Comparator.comparing(Dog::getHeight));
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }


}
class Dog {

    //git 修改测试
    String name;
    int height;
    int weight;

    public Dog(String n, int s, int w) {
        this.name = n;
        this.height = s;
        this.weight = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return getName() + ": size=" + getHeight() + " weight=" + getWeight()
                + " \n";
    }
}