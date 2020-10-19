package test;

import java.util.Scanner;

public class YangHuiTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要打印的行数：");
        int n = scanner.nextInt();
        // 打印杨辉三角

        //  打印成等腰三角形




        // 创建一个二维数组，此二维数组用来存放杨辉三角中每一行的值
        int[][] array = new int[n][n];
        // 给数组元素赋值
        for (int i = 0; i < array.length; i++) {
            // 每一行的值
            array[i] = new int[i + 1];
            // 给首末元素赋值
            array[i][0] = array[i][i] = 1;
            // 给每行的非首末元素赋值
            if (i > 1) {
                for (int j = 1; j < array[i].length - 1; j++) {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }



    /**
     * 打印成等腰三角形
     *
     * @param array
     */

        for (int i = 0; i < array.length; i++) {
            // 输出杨辉三角数字前面的空格
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                // 用空格填补空位置
                System.out.print("   ");
                // 以十进制整数的形式输出，位宽是3，左对齐
                System.out.printf("%-3d", array[i][j]);
            }
            System.out.println();
        }
    }
}

