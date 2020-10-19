package test;

public class 杨晖三角等腰图形 {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = arr.length - 1; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + "  ");

                }
                System.out.println();
            }

        }

    }
}