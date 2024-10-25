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

class Test {
	void m1() {
		
	}
	
	void m1(int a) {
		
	}
	
	void m1(int a, int b) {
		
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.sum(10,20));
		System.out.println(c.sum(10,20,30));
		
		System.out.println(c.sum(10,20,30,40,50,60));
		
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println("comparing t1 & t2 - "+ (t1 == t2));
		
	}
}

class Calculator {
	int sum(int a, int b) {
		return a+b;
	}
	
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	int sum(int... x) {
		int sum = 0;
		for(int a: x) {
			sum = sum + a;
		}
		return sum;
	}
}