/*java.lang 패키지 공부*/

package Java1;
import java.util.*;

class Car implements Cloneable{
	private ArrayList<String> owners = new ArrayList<String>();
	public ArrayList getOwner(){return this.owners;}
	public void setOwner(String name) {this.owners.add(name);}
	
	@Override
	/*
	public Object  clone(){
		try {
			Car clonedCar = (Car)super.clone();
			return clonedCar;
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
            return null;
		}
	}*/
	public Object  clone(){ //이것도 위랑 같음. 그냥 좀더 통상적이라서 고쳐봄. 
		Object cloned = null;
		try {
			cloned = super.clone();
			return cloned;
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
            return null;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		//java.lang.Object: clone()------------------------------------------
		Car car1 = new Car();
		car1.setOwner("a");
		System.out.println("car1: "+ car1.getOwner());
		
		Car car2 = (Car)car1.clone(); //Car class내에 override되어있어야함. 
		car2.setOwner("b");
		System.out.println("car1: "+ car1.getOwner());
		System.out.println("car1: "+ car2.getOwner());
		
		//java.lang.String: charAt()------------------------------------------
		String st1 = "hello";
		System.out.println(st1.charAt(0));
		
		//java.lang.String: compareTo(), compareToIgnoreCase()----------------
		// 기본적으로 같으면 0, 더 작으면 음수, 더 크면 양수반환 
		//compareTo: 대소문자 구분함.
		//compareToIgnoreCase: 대소문자 구분안함.
		String str = new String("abcd");
		 
		System.out.println(str.compareTo("bcef"));
		System.out.println(str.compareTo("abcd")); 
		 
		System.out.println(str.compareTo("Abcd"));
		System.out.println(str.compareToIgnoreCase("Abcd")); //대소문자 구별없이 비교 
		System.out.println();
		
		//java.lang.String: concat()------------------------------------------
		String str2 = new String("Java");
		System.out.println(str2.concat("수업")); //기존 문자열 뒤에 더 붙임. 
		System.out.println(str2); // 원본이 바뀌지 않음!
		String str2_change = str2.concat("수업"); //저장하고싶으면 새로운string이 필요함. 
		System.out.println(str2_change); 
		System.out.println();
		
		//java.lang.String: indexOf()------------------------------------------
		System.out.println(str2.indexOf('a'));
		System.out.println(str2.indexOf('h')); //없으면 -1
		System.out.println();
		
		//java.lang.String: trim()--------------------------------------------
		String str3 = "    Java    ";
		System.out.println(str3 + "hi");
		System.out.println(str3.trim() + "hi"); // 공백 없앰. 
		System.out.println(str3); //trim이 원본을 바꾸지는 않음! 
		System.out.println();
		
		//java.lang.StringBuffer: append()-------------------------------------
		StringBuffer strbf1 = new StringBuffer("Java");
		strbf1.append("Class"); //concat이랑 다르게 원본을 바꿈. 
		System.out.println(strbf1);
		System.out.println();
		
		//java.lang.StringBuffer: capacity()-------------------------------------
		System.out.println(strbf1.capacity()); // java 4글자에 16자리 여유분 추가되어 총 20자리여야함. 
		System.out.println();
		
		//java.lang.StringBuffer: delete()-------------------------------------
		strbf1.delete(1, 3); // 인덱스 2~3을 지움. 
		System.out.println(strbf1);
		System.out.println();
		
		//java.lang.StringBuffer: insert()-------------------------------------
		strbf1.insert(2,"va"); // index 2부터 삽입.
		System.out.println(strbf1);
		System.out.println();
		
		//java.lang.Math: random()-------------------------------------
		/*방법1*/System.out.println((int)(Math.random()*100)); // 0~99
		System.out.println((int)(Math.random()*6));//0~5
		System.out.println((int)(Math.random()*6)+1); // 1~6
		System.out.println((int)(Math.random()*6)+3); // 3~6
		
		/*방법2*/Random ran = new Random();
		System.out.println(ran.nextInt(100));           // 0 ~ 99
		System.out.println();
		
		//java.lang.Math: abs()-------------------------------------
		//절댓값 반환 
		System.out.println(Math.abs(10));    // 10
		System.out.println(Math.abs(-10));   // 10
		System.out.println(Math.abs(-3.14)); // 3.14
		System.out.println();
		
		//java.lang.Math: floor(), ceil(), round()-------------------------------------
		System.out.println(Math.ceil(10.1));      // 11.0
		System.out.println(Math.floor(10.1));     // 10.0
		System.out.println(Math.round(10.1));     // 10
		System.out.println(Math.round(10.5));     // 11
		System.out.println();
		
		//java.lang.Math: max(), min()------------------------------------
		System.out.println(Math.max(3.14, 3.14159)); // 3.14159
		System.out.println(Math.min(3.14, 3.14159)); // 3.14
		System.out.println();
		
		//java.lang.Enum: 선언 ------------------------------------
		enum Rainbow { 
		    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
			// 원래는 0부터 1,2,3 이렇게 가는데 위처럼 특정 값을 지정하고싶으면 괄호 안에 써주고, 밑에 변수랑 생성자 추가해야함. 
		    private final int value;
		    Rainbow(int value) { this.value = value; }
		    public int getValue() { return value; }
		}
		
		Rainbow[] arr = Rainbow.values(); // 해당 열거체의 모든 상수를 저장한 배열을 생성, 반환.
		for(Rainbow r: arr) {
			System.out.println(r);
		}
		System.out.println();
		
		//java.lang.Enum: valueOf() ------------------------------------
		Rainbow r2 = Rainbow.valueOf("RED");//해당 열거체 상수 순서를 반환 
		System.out.println(r2);
		System.out.println();
		
		//java.lang.Enum: ordinal() ------------------------------------
		System.out.println(Rainbow.GREEN.ordinal()); //해당 열거체 상수 순서를 반환 
		System.out.println();
	}
}
