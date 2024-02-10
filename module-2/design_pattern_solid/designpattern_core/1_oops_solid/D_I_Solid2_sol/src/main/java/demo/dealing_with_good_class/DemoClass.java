package demo.dealing_with_good_class;

class GodClass {
	public void f1() {
		System.out.println("i am funcation f1");
	}

	public void f2() {
		System.out.println("i am funcation f2");
	}

	public void f3() {
		System.out.println("i am funcation f3");
	}

	public void f4() {
		System.out.println("i am funcation f4");
	}
}

interface InterfaceA{
	public void f1();
	public void f2();
}
class InterfaceAImp implements InterfaceA{
	private GodClass class1;
	
	
	public InterfaceAImp() {
		class1=new GodClass();
	}

	@Override
	public void f1() {
		class1.f1();
	}

	@Override
	public void f2() {
		class1.f2();
	}
	
}
class Client{
	private InterfaceA interfaceA;

	public Client() {
		interfaceA=new InterfaceAImp();
	}
	
	public void impMethod() {
		interfaceA.f1();
		interfaceA.f2();
	}
}

public class DemoClass {

	public static void main(String[] args) {

	}

}
