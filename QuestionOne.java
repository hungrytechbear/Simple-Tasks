public class QuestionOne {


    //method for checking if array is ascending
    static int checkAscending(int[] array) {
    	int prev = array[0];
    	for (int k = 1; k < array.length; k++) {
    		if (array[k] < prev) {
    			return 0;
            }
    		prev = array[k];
    	}
        return 1;
    }
    
    

    //main class
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int size = A.length - 1;
        int[] B = new int[size];
        int count = 0;
        
        //pointer removes 1 element from array and check if array is still ascending
        for(int i = 0; i < A.length; i++) {
        	int x = 0;
        	for (int j = 0; j < A.length; j++) {
        		if (i != j) {
        			B[x] = A[j];
        			x++;
        		}
        	}
        	if (checkAscending(B) == 1)
        		count++;
        }
        if (count != 0)
        	System.out.println(count+" ways");
        else
        	System.out.println("-1 Error");
    }
}
