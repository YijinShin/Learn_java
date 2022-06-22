package Main;

public class MainClass {

	public static void main(String[] args) {
		Child ch1 = new Child();
		Child ch2 = new Child();
		
		// 상속받은 static, instance 차이 확인 -------------------------------------------
		System.out.print("[ch1]");
		ch1.printNums();
		System.out.print("[ch2]");
		ch2.printNums();
		
		ch1.changeStaticNum1();
		ch1.changeNonStaticNum3();
		
		System.out.print("[ch1]");
		ch1.printNums();
		System.out.print("[ch2]");
		ch2.printNums();
		
		//polymorphism -------------------------------------------------------------
		Class1 c1_1 = new Class2();
		Class1 c1_2 = new Class3(); // 손자도 가능. 
		Class2 c2_1 = new Class3();
		
		Class1 c1_3 = null;
		Class2 c2_2 = new Class2();
		Class3 c3_1 = new Class3();
		c1_3 = (Class1)c2_2;
		c1_3 = (Class1)c3_1;
		
		Class2_bro cl2_bro = null;
		//cl2_bro = (Class2_bro)c2_2; c2_2와 cl2_bro는 서로 상하 상속관계가 아니라서 안됨. 
		
		//instanceOf ---------------------------------------------------------------
		//참조 변수가 실제로 가리키는 인스턴스 타입을 확인해줌. (같으면 true, 틀리면 false)
		Class1 class1 = new Class1();
		Class1 class2 = new Class2();
		System.out.println(class1 instanceof Object);
		System.out.println(class1 instanceof Class1);
		System.out.println(class1 instanceof Class2); // false
		
		System.out.println(class1 instanceof Object);
		System.out.println(class2 instanceof Class1); // true: Class2인스턴스를 참조했지만 Class2가 결국 Class1을 상속해서 둘다 가지고있는것. 
		System.out.println(class2 instanceof Class2);
		
		// abstract method --------------------------------------------------------
		
		
	}

}
