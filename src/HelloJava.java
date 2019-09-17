
public class HelloJava {
//	private static String say = "我要学会你。";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("你好 Java " + say);
		int limit = 100;
		int num1 = 15;
		int num2 = 40;
		if ( limit <= limit)
		{
		    if ( num1 == num2 )
		        System.out.println("lemon");
		    System.out.println("lime");
		}
		System.out.println("grape");
	    String s = "hello";
	    s = s+" world ";
	    s.toUpperCase();
	    s=s.trim();
		System.out.println(s);
		int i = 2;
	    Loop1:
	        while ( true ) {      //  1
	          for ( ; true; ) {
	            if ( i ==2 )
	              break;  //  2
	          }
	          i=4;        //  3
	          break;
	        }
	        i=5;          //  4
	}
}