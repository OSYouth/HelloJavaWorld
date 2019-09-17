
public class AnyThing {
	static int id = 0;
	public AnyThing(){
		this("this 调用有参构造方法");
		System.out.println("无参构造方法");
	}
	
	public AnyThing( String name ){
		System.out.println(name);
//		System.out.println("有参构造方法");
	}
	
	public static void test(){
		System.out.println("diaoyong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnyThing();
		test();	//调用的方法必须为静态方法

	}

}
