/*java.util패키지 공부 */

package Java2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		
		//binarySearh()---------------------------------------
		for(int i = 0; i<arr1.length;i++)arr1[i]=i*10;
		System.out.println(Arrays.binarySearch(arr1, 30));
		
		//copyOf()------------------------------------------
		int[] arr1_copy1 = Arrays.copyOf(arr1, 3);
		for(int i =0;i<arr1_copy1.length;i++)System.out.print(arr1_copy1[i]+" ");
		System.out.println();
		
		int[] arr1_copy2 = Arrays.copyOf(arr1, 10);
		for(int i =0;i<arr1_copy2.length;i++)System.out.print(arr1_copy2[i]+" ");
		System.out.println();
		
		//copyOfRange()---------------------------------------
		int[] arr1_copy3 = Arrays.copyOfRange(arr1_copy2, 2, 5); // index 2~5까지 복사 
		for(int i =0;i<arr1_copy3.length;i++)System.out.print(arr1_copy3[i]+" ");
		System.out.println();
		
		//fill()---------------------------------------------
		int[] arr2 = new int[10];
		Arrays.fill(arr2, 10);
		for(int i =0;i<arr2.length;i++)System.out.print(arr2[i]+" ");
		System.out.println();
		
		//sort()---------------------------------------------
		int[] arr3 = {1,9,3,6,2};
		Arrays.sort(arr3);
		for(int i =0;i<arr3.length;i++)System.out.print(arr3[i]+" ");
		System.out.println();
		
		//java.util.GregorianCalendar ------------------------
		Calendar time = Calendar.getInstance();
		System.out.println(time.getTime());
		//add()
		time.add(Calendar.SECOND, 120); // 현 시각에 120초 더하기 
		System.out.println(time.getTime());
		//get()
		System.out.println(time.getTime());
		System.out.println(time.get(Calendar.DAY_OF_WEEK));
		System.out.println(time.get(Calendar.MONTH) + 1);
		System.out.println(time.get(Calendar.DAY_OF_MONTH));
		System.out.println(time.get(Calendar.HOUR_OF_DAY));
		System.out.println(time.get(Calendar.MINUTE));
		System.out.println(time.get(Calendar.SECOND));
		System.out.println(time.get(Calendar.YEAR));
	}

}
