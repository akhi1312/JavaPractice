import java.util.Arrays;

public class SelectionSort {
	
	public static void selectSort(int [] array){
		if (array == null || array.length < 2 ){
			return ;
		}
	
		int n = array.length;
		
		for (int i = 0 ; i < n ; i++ ) {
			
			int minIndex = i ;
			
			for(int j = i+1 ; j < n; j++) {
				
				if(array[j] < array[minIndex]){
					minIndex = j ;
				}
				
			}
			
			if( i != minIndex && array[i] != array[minIndex]){
				
				swap(array , i , minIndex);
			}
			
		}
		
	}
	
	public static void swap (int[] array  , int i  , int  j ){
		
		int temp = array[i];
        array[i] = array[j];
        array[j] = temp ;
	}
	
	
     public static void main(String[] args){
    	 
    	 int [] array = {12, 35, 87, 26, 9, 28, 7}; 
    	 selectSort(array);
    	 System.out.println("Sorted array using Selection sort is " + Arrays.toString(array));
    	 
     }
	
}
