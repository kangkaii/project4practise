package kk.practise;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class StringSavingUtils {
    /**
     * 根据参数length,将String类型对象，进行截取
     * 用于将长字符串，存入数据库中
     * 避免过长 数据库保存失败
     * 避免直接写死长度 产生不必要数据
     * 前提：一个汉字 占3个字节
     *      一个英文 占1个字节
     * @param content 需要截取的字符串
     * @param lengthMax 数据库中存储的最大长度
     * @param lengthCN 汉字占的字节数
     * @return List<String>
     */
    public static List<String> getList(String content,int lengthMax,int lengthCN) {
        List<String> resultList = new ArrayList<>();
        if (StringUtils.isEmpty(content) || lengthMax <= 0 || lengthCN <= 0 || (lengthMax <=lengthCN)) {
            throw new RuntimeException("参数非法");
        }
        try {
            while(true) {
                //最好情况：content即使都是中文，也 <= lengthMax
                if (content.length() <= lengthMax / lengthCN) {
                    resultList.add(content);
                    break;
                }
                //有超长的可能
                else {
                    int lenStart = 0;
                    //截取到lengthMax / lengthCN，计算总长度
                    for (int i = 0; i < lengthMax / lengthCN; i++) {
                        //获取每个c的长度+++
                        String c = content.substring(i,i+1);
                        lenStart += c.getBytes("UTF-8").length;
                    }
                    StringBuilder builder = new StringBuilder(content.substring(0, (lengthMax / lengthCN)));
                    //for循环，循环到总长度或者lenStart到length--->2000
                    int i = lengthMax / lengthCN;
                    while (lenStart <= lengthMax && i < content.length()) {
                        String c = content.substring(i,i+1);
                        lenStart += c.getBytes("UTF-8").length;
                        builder.append(c);
                        i++;
                    }
                    if (lenStart <= lengthMax) {
                        resultList.add(content);
                        break;
                    }else {
                        content = content.substring(i-1);
                        String line = builder.toString();
                        resultList.add(line.substring(0,line.length()-1));
                    }
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> result = getList("12345678901234567980",4,3);
        System.out.println(result);
        StringBuilder sb = new StringBuilder();
        result.forEach(r ->sb.append(r));
        System.out.println(sb.toString());
        System.out.println("");
    }

}
