package interfaceExample;

public class TestInterface implements InterfaceExample, InterfaceExample1{
	
	public void show() {
	}
	
	@Override
	public void test1() {
		
		
	}

	@Override
	public void test2() {
		
		
	}

	@Override
	public void test3() {
		
		
	}

	@Override
	public void test5() {
		
		
	}

	@Override
	public void test6() {
		
		
	}

	@Override
	public void test4() {
		
		
	}
	public static void main(String[] args) {
		//We cannot create object from interface, we can only reference to the interface
		//InterfaceExample obj = new InterfaceExample();
		InterfaceExample obj = new TestInterface();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test5();
		obj.test6();
		
		InterfaceExample1 obj1 = new TestInterface();
		obj1.test4();
		
		TestInterface obj2 = new TestInterface();
		obj2.test1();
		obj2.test2();
		obj2.test3();
		obj2.test4();
		obj2.test5();
		obj2.test6();
		obj2.show();
		
		
		
	}
	
	
	
}
