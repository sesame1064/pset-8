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
		if(numbers == null || numbers.length < 3 || numbers.length % 2 == 0){
			return -1.0;		// default return value to ensure compilation
		}else{
			double biggest = numbers[0];
			double middle = numbers[numbers.length / 2];
			double end = numbers[numbers.length-1];

			if(biggest < middle){
				biggest = middle;
			}
			if(biggest < end){
				biggest = end;
			}
			return biggest;			
		}
	}
	
	public String[] middle(String[] values) {
		// write your code here
		if(values == null || values.length < 3 || values.length % 2 == 0){
			return new String[0];	// default return value to ensure compilation
		}else{
			int indexMid = values.length / 2;
			String middle = values[indexMid];
			String upper = values[indexMid + 1];
			String lower = values[indexMid - 1];

			String[] finalArray = {lower, middle, upper};
			return finalArray;
		}

	}

	public boolean increasing(int[] numbers) {
		// write your code here
		if(numbers == null || numbers.length < 3){
			return false;	// default return value to ensure compilation
		}
		for(int i = 0; i < numbers.length - 2; i++){
			if(numbers[i] < numbers[i + 1] && numbers[i + 1] < numbers[i + 2]){
				return true;
			}
		}
		return false;
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		if(numbers == null || numbers.length < 2){
			return false;
		}
		for(int i = 1; i < numbers.length - 1; i++){
			if(!(numbers[i] == x || numbers[i - 1] == x || numbers[i + 1] == x)){
				return false;
			}
		}
		return true;

	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		if(numbers == null || numbers.length < 3){
			return false;
		}
		for(int i = 1; i < numbers.length - 1; i++){
			if(numbers[i - 1] % 2 == 0 && numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0){
				return true;
			}
		}  
		for(int y = 1; y < numbers.length -1; y++){
			if(numbers[y - 1] % 2 != 0 && numbers[y] % 2 != 0 && numbers[y + 1] % 2 != 0){
				return true;
			}
		}
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		if(numbers == null || numbers.length < 2){
			return false;
		}
		for(int i = 1; i < numbers.length; i++){
			int[] first = Arrays.copyOfRange(numbers, 0, i);
			int[] second = Arrays.copyOfRange(numbers, i, numbers.length);
			int x = 0;
			int y = 0;
			for(int j = 0; j < first.length; j++){
				x += first[j];
			}
			for(int j = 0; j < second.length; j++){
				y += second[j];
			}
			if(x == y){
				return true;
			} 
		}
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		if (values == null) return -1;
		for (String word : values) {
			if (word == null) return -1;
		}
		int output = 0; boolean in = false;
		for (int i = 1; i < values.length; i++) {
			if (values[i].equals(values[i - 1])) {
				if (!in) {
					in = true;
					output++;
				}
			} else in = false;
		} return output;
	}

	public static void main(String[]args){
		
	}
}
