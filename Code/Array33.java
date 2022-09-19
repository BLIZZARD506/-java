import java.util.Random;

public class Array33 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[] flag = new int[10];
        Random r = new Random();
        int ranNum;
        int i = 0,j = 0;
        do{
            ranNum = r.nextInt(9)+1;
            if(flag[ranNum] == 0){
                a[i][j] = ranNum;
                flag[ranNum] = 1;
                if(j < 2){
                    j++;
                } else if (j == 2) {
                    j=0;
                    i++;
                }
            }
        }while (i < 3);
        for(int k = 0;k < 3;k++){
            for(int m = 0;m < 3;m++){
                System.out.print(a[k][m]);
            }
        }
    }
}
