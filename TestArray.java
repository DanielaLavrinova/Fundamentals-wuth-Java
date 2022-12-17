
public class TestArray {
	
	public static void printArray(int [] array) {
		
		for( int i = 0;i< array.length;i++) {
			
			System.out.print(array[i] + " ");
			
		}
		
	}
	
	public static int[] reverse( int [] list) {
		
		int [] result = new int[list.length];
	    int len= result.length;
		for(int i=0,j = len-1;i<len;i++,j--) {
			
			result[j]=list[i];
			
		}
		return result;
		
	}
	
	public static void main(String [] args) {
		
		printArray(new int[] {5,6,7,9,0});
		System.out.println(" ");
		printArray(reverse(new int [] {6,7,8,9}));
		
		
	}

}
