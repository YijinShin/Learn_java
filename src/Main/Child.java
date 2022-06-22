package Main;

//abstarct method -------------------------------------------------------------
abstract class ab_Parent{ // 해당 class가 abstarct method를 가지고있으면 abstract class라고 해야할 뿐임. 다른 차이점 없음.
	int a;
	abstract void abMethod();  
}
class ab_Child extends ab_Parent{
	int b;
	void abMethod(){System.out.println("Class2에서 오버라이드");} // ab_Parent이 abstract class라서 오버라이딩 안하면 오류남
}

//polymorphism -------------------------------------------------------------
class Class1{int a;}
class Class2 extends Class1{int b;}
class Class2_bro extends Class1{int b_1;}
class Class3 extends Class2{int c;}

//상속받은 static, instance 차이 확인 -------------------------------------------
class Parent{
	static int num1 = 1; // class variable, default
	private int num2 = 2; // instance variable, private  
	public int num3 = 3; // instance variable, public
	
	int a;
	Parent(){a=10;}
	Parent(int n){a = n;}
}


public class Child extends Parent{
	int num4 = 4;
	int b;
	
	Child(){
		super(100); // 이것도 주석처리해서 여기 super가 없으면 그냥 super()을 실행해버림 
		b = 100;
		//super(100);// super()는 무조건 자녀생성자의 첫줄에 와야함. 
	}
	
	
	void printNums() {
		System.out.print(" num1: " + num1);
		//System.out.println("num2: " + num2); // num2는 private이라 child class에서 접근이 아예 안됨. 
		System.out.print(" num3: " + num3);
		System.out.print(" num4: " + num4);
		System.out.print(" a: "+a);
		System.out.println();
	}
	
	void changeStaticNum1(){
		num1 = num1+10;
	}
	
	void changeNonStaticNum3(){
		num3 = num3+10;
	}
	
}
