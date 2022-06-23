/*collection framework*/
package Java3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//List 컬랙션 클래스:ArrayList --------------------------------------------------------------
		ArrayList<String> arrList = new ArrayList<String>(); //int는 Integer로 써야함.
		arrList.add("b");// 리스트에 추가.
		arrList.add("a");
		arrList.add("c");
		System.out.println(arrList.get(0)); //리스트 요소 가져오기 
		System.out.println(arrList.size()); //리스트 요소 갯수
		Collections.sort(arrList); //리스트 정렬 
		arrList.set(0, "d"); //인덱스0번을 바꿈. 
		for(int i = 0;i<arrList.size();i++) {System.out.print(arrList.get(i)+" ");}
		System.out.println();
		arrList.remove(1); //인덱스 1번 지움
		for(int i = 0;i<arrList.size();i++) {System.out.print(arrList.get(i)+" ");}
		
		Iterator<String> iter = arrList.iterator(); //iterator()메소드를 활용한 리스트 출력
		while (iter.hasNext()) {
		    System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		//List 컬랙션 클래스:LinkedList (함수는 거의 어레이리스트와 같음.) -----------------------------------
		LinkedList<String> lnkList = new LinkedList<String>();
		
		//List 컬랙션 클래스:Stack ----------------------------------- -------------------------------
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.search(2));//없으면 -1반환
		System.out.println();
		
		//Queue 인터페이스: Deque --------------------------------------------------------------
		// Deque, ArrayDeque, LinkedList << que쓸때 이거 세개를 가장 많이 씀. 
		Deque<Integer> qu = new ArrayDeque<Integer>();
		ArrayDeque<Integer> arrQue = new ArrayDeque<Integer>(); 
		LinkedList<Integer> linkQue = new LinkedList<Integer>(); //linkedlist로 큐를 많이 씀. 
		linkQue.add(1);
		linkQue.add(2);
		linkQue.add(3);
		linkQue.add(4);
		System.out.println(linkQue);
		System.out.println(linkQue.peek()); //반환
		System.out.println(linkQue);
		System.out.println(linkQue.poll()); //반환 및 제거
		System.out.println(linkQue);
		linkQue.remove(); // 제거
		System.out.println(linkQue);
		
	}

}
