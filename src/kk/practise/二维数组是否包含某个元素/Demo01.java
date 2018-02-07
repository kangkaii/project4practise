package kk.practise.二维数组是否包含某个元素;

/**
 * @author kangkai on 2017/10/26.
 */
public class Demo01 {

    public static void main(String[] args) {
            int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 88}};
        System.out.println(find(matrix, 4, 4, 15));
    }

    public static boolean find(int[][] matrix,int rows,int columns,int number) {
        boolean result = false;
        if (matrix != null && rows > 0 && columns > 0) {
            int row = rows - 1;
            int column = 0;
            while (row >= 0 && column < columns) {//从左下角开始，这样可以根据大于元素或者小于，来决定下一个对比的位置；
                if (matrix[row][column] > number) {
                    row--;
                }
                if (matrix[row][column] < number) {
                    column++;
                } else {
                    result = true;
                    break;
                }
            }
        }
        return result;

    }

}
