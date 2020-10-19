package test;

import java.util.Scanner;

public class Test杨辉三角文本写 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入想要的行数");
        int n=input.nextInt();
        int [] [] arr = new int [n][n];


        for(int i =0; i< arr.length;i++){
            arr[i][0]=1;
            arr[i] [i] =1;
        }
        for(int i=1; i< arr.length;i++){//第一个数已定义 所以从第二行开始
            for(int j=1 ;j<=i-1;j++){   //同理 每行的最后一个数也已静被定义，所以要i-1
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0 ;j<=i;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
