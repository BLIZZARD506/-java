import java.util.Arrays;

public class RaggedArray {
    public static void main(String[] args) {
        char[][] a = new char[3][];
        a[0] = new char[]{'a','b','c','d'};
        a[1] = new char[]{'x','y','z'};
        a[2] = new char[]{'1','2'};
        for (char[] b:a){
            System.out.println(Arrays.toString(b));
        }
    }
}