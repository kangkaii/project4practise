package kk.practise.return测试;

/**
 * Created by  kk on 2017/10/11.
 */
public class Test02 {

    public static int fun(){
        if (true) {
            return 1;
        }
        int x = 1/0;//只要return过了 ，就不会执行 下面的代码
        return 3;
    }

    static int fun2() {
        int i = 1;
      return ++i;
    }
    public static void main(String[] args) {
        System.out.println(fun());
    }

}
