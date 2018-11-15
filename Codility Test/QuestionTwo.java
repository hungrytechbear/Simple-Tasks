
public class QuestionTwo {

	public static void main(String[] args) {
		
		String S = "3 DUP 8 6 -";
	    String[] a = S.split(" ");
	    int[] Stack = new int[2000];
	    //int j = 0;
	    String num = "-1";
	    for(int i = 0,j = 0; i < a.length; i++) {
	        if (a[i].equals("DUP")){
	        	if (j > 0) {
		            Stack[j]=Stack[j-1];
		            j++;
		            num = String.valueOf(Stack[j-1]);
	        	}
	        	else
	        		num = "Error 1";
	        }
	        else {
		        if (a[i].equals("POP")){
		        	if (j > 0) {
			            j--;
			            num = String.valueOf(Stack[j-1]);
		        	}
		        	else
		        		num = "Error 2";
		        }
		        else {
			        if (a[i].equals("+")){
			        	if (j > 1) {
				            //int o = Integer.valueOf(Stack[j-1]);
				            //int t = Integer.valueOf(Stack[j-2]);
				            Stack[j-2]=Stack[j-1] + Stack[j-2];
				            num = String.valueOf(Stack[j-2]);
				            j=j-1;
			        	}
			        	else
			        		num = "Error 3";
			        }
			        else {
				        if (a[i].equals("-")){
				        	if (j > 1) {
					            //int o = Integer.valueOf(Stack[j-1]);
					            //int t = Integer.valueOf(Stack[j-2]);
					            Stack[j-2]=Stack[j-1] - Stack[j-2];
					            num = String.valueOf(Stack[j-2]);
					            j=j-1;
				        	}
				        	else
				        		num = "Error 4";
				        }
				        else{
					        num = String.valueOf(a[i]);
					        Stack[j] = Integer.valueOf(num);
					        j++;
				        }
			        }
		        }
	        }
	    }
	     
	    //int r = Integer.parseInt(Stack[j]);
	    System.out.println(num);
	}

}

/*
//you can also use imports, for example:
//import java.util.*;

//import java.util.Scanner;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(String S) {
     // write your code in Java SE 8
     
     /*
     algorithm
     read the string XXvia scannerXX via split
     follow the operation requirement for the stack
     return answer
     otherwise error, return -1
     
     
     //Scanner sc = new Scanner(System.in);
     
     String[] a = S.split(" ");
     int[] Stack = new int[2000];
     //int j = 0;
     int num = -1;
     for(int i = 0,j = 0; i < a.length; i++) {
         if (a[i].equals("DUP") && j>=1){   // <<<< how to get system to read this
             Stack[j]=Stack[j-1];
             j++;
         }
         if (a[i].equals("POP") && j>=1){
             j--;
         }
         if (a[i].equals("+")){
             //int o = Integer.valueOf(Stack[j-1]);
             //int t = Integer.valueOf(Stack[j-2]);
             Stack[j-2]=Stack[j-1] + Stack[j-2];
             j=j-2;
         }
         if (a[i].equals("-")){
             //int o = Integer.valueOf(Stack[j-1]);
             //int t = Integer.valueOf(Stack[j-2]);
             Stack[j-2]=Stack[j-1] - Stack[j-2];
             j=j-2;
         }
         else{
         num = Integer.parseInt(a[i]);
         Stack[j] = num;//Integer.valueOf(a[i]);
         j++;
         }
     }
     
     //int r = Integer.parseInt(Stack[j]);
     return num;
 }
}
*/