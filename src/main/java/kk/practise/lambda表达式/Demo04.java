package kk.practise.lambda表达式;

/**
 * @author kangkai on 2018/1/30.
 */
@FunctionalInterface
interface IComputer {
    int add(int a, int b);
}

public class Demo04 {

    public static void main(String[] args) {
        IComputer computer = (a, b) ->
                a+b;
        int result = computer.add(1,2);
        System.out.println(result);
    }
}

