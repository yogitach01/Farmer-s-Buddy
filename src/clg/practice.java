package clg;
import java.util.*;

class calculator{
	int a;
	int b;
	
	public int sum() {
		return a+b;
	}
	public int diff() {
		return a-b;
	}
}

class mult extends calculator{
	public int multiplication() {
		return a*b;
	}
}

class div extends calculator{
	public int divison() {
		return a/b;
	}
}

public class practice {
	public static void main(String[] args) {
		calculator n1=new calculator();
		n1.a=100;
		n1.b=50;
		System.out.println(n1.sum());
		System.out.println(n1.sum());
		mult n2=new mult();
		n2.a=100;
		n2.b=50;
		System.out.println(n2.multiplication());
		System.out.print(n2.sum());
		
	}
}