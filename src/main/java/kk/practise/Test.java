package kk.practise.practise;

public class Test
{


    public static void main(String[] args) {
        String str = "你好好好";
        /*try {
            str = new String(str.getBytes("utf-8"));
        }catch (Exception e){
            e.printStackTrace();
        }*/
        str = str.substring(0,1);
        System.out.println(str.length() );
    }



}
