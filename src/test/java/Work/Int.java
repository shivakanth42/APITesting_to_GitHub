package Work;

public class Int {
	public static void main(String[] args) {
	A obj = new D();
	obj.add();
	obj.minus();
	obj.div();
	obj.dd();
	System.out.println(obj.a);
//	obj.a=150;
	}
	

	
	
}


interface A{
	public void add();
	public void minus();
	public void div();
	public void dd();
	int a =10;
	int b =20;
}


abstract class B implements A{
	public void add() {
		System.out.println("Add method");
	}
	public void minus() {
		System.out.println("Minus method");
	}
		
}


abstract class C extends B{
	public void div() {
		System.out.println("Div method");
	}
}


class D extends C{
	public void dd() {
		System.out.println("Concrete method");
	}
	
}


