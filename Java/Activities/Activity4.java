package Activity;

public class Activity4 {
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 5, 6};
	        System.out.print("Array before sorting: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	        System.out.print("Array after sorting: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


