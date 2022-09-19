public class swapFun {
    public static void main(String[] args){
        int a=1,b=2;
        Integer k=1,j=2;
        swap(a,b);
        swap(k,j);
        System.out.println(a+" "+b);
        System.out.println(k+" "+j);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap(Integer a, Integer b){
        Integer temp = new Integer(a);
        a = b;
        b = temp;
    }

}
