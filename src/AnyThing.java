
public class AnyThing {
	static int id = 0;
	public AnyThing(){
		this("this �����вι��췽��");
		System.out.println("�޲ι��췽��");
	}
	
	public AnyThing( String name ){
		System.out.println(name);
//		System.out.println("�вι��췽��");
	}
	
	public static void test(){
		System.out.println("diaoyong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnyThing();
		test();	//���õķ�������Ϊ��̬����

	}

}
