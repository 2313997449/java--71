package test;

import java.util.Arrays;
import java.util.Scanner;

/*
     编写java程序，从键盘确定数组的维数，从键盘输入二维数组各个元素值，
    打印输出这个二维数组，并打印输出行列颠倒的二维数组。
 */
public class Java倒输二维数组 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的行和列");
        int n = input.nextInt();
        int s = input.nextInt();
        int [] [] nums = new int[n][s];
        int [] [] nuas = new int[n][s];
        int a=0;
        int b=0;

//        System.out.println("请输入数组的元素");
//        for (int i=0; i<n;i++){
//            for (int j=0;j<s;j++){
//                nums[i][j]=input.nextInt();
//                if (j==0){
//                    nuas[j][i]=nums[i][j];
//                }
//                if (j==1){
//                    nuas[j][i]=nums[i][j];
//                }
//                if (j==2){
//                    nums[j][i]=nums[i][j];
//                }
//            }
//            System.out.print("输入完毕");
        System.out.println("请输入数组的元素");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = input.nextInt();
                System.out.println("请继续输入元素");
            }
        }
        System.out.println("输入完毕");
//      }
        System.out.println("依次打印输入的二维数组：");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(nums[i][j] + "   ");
            }
            System.out.println();
        }
        //矩阵行列进行交换
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nuas[j][i] = nums[i][j];
            }
        }
        //输出交换后的矩阵
        System.out.println("依次输出行列颠倒的二维数组：");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(nuas[i][j] + "   ");
            }
            System.out.println();
        }
    }
}