package kk.practise.io流.字符流;

import java.io.FileWriter;
import java.io.IOException;

/**本例说明：
 * 调用new FileWriter时候，将 append 设置为 true
 * 可以实现续写！
 * @author kangkai on 2018/3/15.
 */
public class FileWriterDemo3 {
    public static void main(String[] args) {

        try {
            //传递一个参数,代表不覆盖已有的数据。并在已有数据的末尾进行数据续写
            FileWriter fw = new FileWriter("F:\\ReaderOrWriter\\test.txt",true);
            fw.write(" 这是续写的内容！");
            fw.close();
        }
        catch (IOException e) {
            sop(e.toString());
        }

    }

    /**********************Println************************/
    private static void sop(Object obj)
    {
        System.out.println(obj);
    }

}
