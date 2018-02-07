package kk.practise.return测试;

/**
 * Created by  kk on 2017/9/27.
 */
public class Test {//如有有if存在，在if中直接return,其余不写，报错
    //解决方式1 ： 写else，return 正确类型返回值
    //解决方式2 ： 写else，抛出异常

    int test(){
        return 1;
    }

    int test2(){
        if (true) {
            return 1;
        }
        else {
            throw new RuntimeException("1");
        }
    }

}
