package test;

public class Test三位学生5门课求高低分 {

    public static void main(String[] args) {
        int[][] scores = {{96, 89, 87}, {89, 86, 85}, {75, 76, 63}};
        int total;
        int max = 0;
        int mix = 0;
        for (int i = 0; i < scores.length; i++) {
            total=0;
            for (int j = 0; j < scores.length; j++) {
                max = scores[i][0];
                if (max < scores[i][j]) {
                    max = scores[i][j];
                }
                    mix = scores[i][0];
                    if (mix > scores[i][j]) {
                        mix = scores[i][j];
                    }
                    total=total+scores[i][j];
            }
            System.out.println("第" + (i + 1) + "位同学的平均分是" + total / 3 + "最高分数是" + max + "最低分数是" + mix);

        }
    }
}