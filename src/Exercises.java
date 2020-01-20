import java.util.Arrays;
public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		// write your code here
		if(a[0] == b[0] || a[a.length -1] == b[b.length -1 ]){
			return true;
		}
		return false;	// default return value to ensure compilation
	}
	
	public String[] endsMeet(String[] values, int n) {
		// write your code here
		if(values == null || n < 1 || values.length < n ){
			return new String[0];
		}
		
		String[] first = Arrays.copyOfRange(values, 0, n);
		String[] last = Arrays.copyOfRange(values, values.length-n , values.length);

		String[] finalArray = new String[first.length + last.length];
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(first, 0, finalArray, 0, first.length);
		System.arraycopy(last, 0, finalArray, first.length, last.length);
		
		return finalArray;
		
	}
	
	public int difference(int[] numbers) {
		// write your code here
		if(numbers == null || numbers.length == 0){
			return -1;
		}else{
			int min = numbers[0];
			int max = numbers[0];

			for(int number : numbers){
				if(number > max){
					max = number;
				}
				if(number < min){
					min = number;
				}
			}
			return max - min;

		}
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}

	public static void main(String[]args){
		
	}
}
