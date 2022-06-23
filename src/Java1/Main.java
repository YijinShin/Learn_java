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
		System.out.println();
		
		//java.lang.String: indexOf()------------------------------------------
		System.out.println(str2.indexOf('a'));
		System.out.println(str2.indexOf('h')); //없으면 -1
		System.out.println();
		
		//java.lang.String: trim()------------------------------------------
		String str3 = "    Java    ";
		System.out.println(str3 + "hi");
		System.out.println(str3.trim() + "hi"); // 공백 없앰. 
		System.out.println(str3); //trim이 원본을 바꾸지는 않음! 
		System.out.println();
	}
}
