public class Test {
    private int i = f(); 
    private int j = 10;
    private int f() {
        return j;
    }
    public static void main(String args[]) { 
        System.out.println((new Test()).i); 
    }
}