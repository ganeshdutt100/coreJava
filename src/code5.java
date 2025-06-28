public class code5 {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public int add(int a, int b,int c,int d){
        return a+b+c +d;
    }
    public static void main(String[] args) {
        code5 obj = new code5();
        System.out.println( obj.add(12,89));
        System.out.println( obj.add(12,89 , 89));
        System.out.println( obj.add(12,89 , 89, 78));
    }
}
