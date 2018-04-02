package kk.practise;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class StringUtilsByKK {
    /**
     * 根据参数length,将String类型对象，进行截取
     * @param length 规定的长度
     * @param content 需要截取的字符串
     * @return List<String>
     */
    public static List<String> getList(String content,int length) {
        List<String> resultList = new ArrayList<>();
        try {
            for (; true; ) {
                //666以上，有超长的可能
                if (content.length() > length / 3) {
                    //初始长度
                    int lenStart = 0;
                    char c;
                    //截取到666，计算总length
                    for (int i = 0; i < length / 3; i++) {
                        //获取每个c的长度+++
                        c = content.charAt(i);
                        lenStart += String.valueOf(c).getBytes("UTF-8").length;
                    }
                    //lenStart已经更新为666的长度-------
                    StringBuilder builder = new StringBuilder();
                    //content的0-666给builder
                    builder.append(content.substring(0, (length / 3) + 1));
                    //for循环，循环到总长度或者lenStart到length--->2000
                    for (int i = length / 3; i < content.length(); i++) {
                        c = content.charAt(i);
                        lenStart += String.valueOf(c).getBytes("UTF-8").length;
                        builder.append(c);
                        //情况1：到2000了
                        if (lenStart > length) {
                            //用当前的i,截取字符串
                            // 需要截取，将原始字符串转换为utf-8编码格式
                            //content = new String(content.getBytes(),"UTF-8");
                            //截掉前面的
                            content = content.substring(i, content.length());
                            String line = builder.toString();
                            resultList.add(line);
                            break;
                        }
                    }
                    //情况2：加完都没到2000
                    if (lenStart < length) {
                        resultList.add(content);
                        break;
                    }
                }
                //被截取完，剩下的不够666
                if (content.length() <= length / 3) {
                    resultList.add(content);
                    break;
                }
            }
            //不到666，放行
            if (content.length() <= length / 3) {
                resultList.add(content);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return resultList;
    }

}
