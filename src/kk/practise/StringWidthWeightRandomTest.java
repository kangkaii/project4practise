package kk.practise.practise;

public class StringWidthWeightRandomTest {

    public static void main(String[] args){

        StringWidthWeightRandom random = new StringWidthWeightRandom(
                new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' });

        StringWidthWeightRandom randomChinese = new StringWidthWeightRandom(

                new char[] { '我', '是', '测', '试', '的', '汉', '字' , 'A', 'B', 'C', 'D', 'E', 'F', 'G'});

        /*for (int i = 1; i <= 4000; i++) {
                System.out.println(random.getNextString(i));
        }*/
        System.out.println(random.getNextString(2001));
        System.out.println(randomChinese.getNextString(2000));

    }


}
