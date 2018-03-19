package kk.practise.io流.字符流.将F盘的一个文件复制到E盘;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author kangkai on 2018/3/15.
 */
public class Demo01 {

    public static void main(String[] args) {

        try {
            //已经新建文件demo01.txt 并写入内容
            FileWriter fw = new FileWriter("F:\\ReaderOrWriter\\demo01.txt");
            fw.write("ceshineirong");
            fw.close();

            //epan 新建文件
            FileWriter fw_e = new FileWriter("E:\\demo01.txt");

            //拿到 f盘文件内容
            FileReader fileReader = new FileReader("F:\\ReaderOrWriter\\demo01.txt");
            //读 内容
            char []  buf = new char[60];
            int num = 0;
            while ((num = fileReader.read(buf)) != -1) {
                fw_e.write(new String(buf,0,num));
            }
            fw_e.close();
            FileReader fileReader_e = new FileReader("E:\\demo01.txt");

        }catch(IOException e) {
            System.out.println(e.toString());
        }

    }


}
