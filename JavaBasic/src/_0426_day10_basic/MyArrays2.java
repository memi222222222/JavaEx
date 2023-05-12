package _0426_day10_basic;

public class MyArrays2 {
	
	private MyArrays2() {
		
	}
	
	public static String printArray(String[] arr) {
		String str = " [";
		for(int i = 0; i <arr.length; i++) {
			
			str += arr[i];
			if( i == arr.length-1) {
				return str +="]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	
	public static String printArray(int[] arr) {
		String str = " [";
		for(int i = 0; i <arr.length; i++) {
			
			str += arr[i];
			if( i == arr.length-1) {
				return str +="]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	public static String printArray(char[] arr) {
		String str = " [";
		for(int i = 0; i <arr.length; i++) {
			
			str += arr[i];
			if( i == arr.length-1) {
				return str +="]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
}
