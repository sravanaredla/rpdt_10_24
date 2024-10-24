public class Sample {
	void someMethod(int a, int b) {
		Test1 t1 = new Test1();
		t1.m1(a,b);
	}
}

class Test1 {
	void m1(int a, int b) {
		Test2 t2 = new Test2();
		t2.m2(a,b);
	}
}

class Test2 {
	void m2(int a, int b) {
		System.out.println("a + b = "+(a+b));
	}
}

class Client {
	public static void main(String[] args) {
		//Client has a request 
		Sample s1 = new Sample();
		s1.someMethod(10,20);
		Client c2$3;
		
	}
}

class A {
	int a;
	
	void m1(int a) {
		
	}
}