package test;

import java.util.Scanner;

public class Test杨晖三角实践 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入，你想要的行数");
        int n= input.nextInt();
        int [][] arr= new int[n][n];


        for (int i=0;i< arr.length;i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (int x=0;x< arr.length;x++) {
            for (int y = 1; y <= x - 1; y++) {//y不能为0，因为第一列已经有值了
                arr[x][y] = arr[x - 1][y - 1] + arr[x - 1][y];
            }
        }


        for (int i=0; i< arr.length;i++){
            for (int y=0; y<=i;y++){
                System.out.print(arr[i][y]+"\t");
            }
            System.out.println();

        }
        input.close();
        }




    }

