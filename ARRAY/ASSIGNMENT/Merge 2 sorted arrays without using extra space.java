import java.util.*;
class Main {
    public static void merge(int ar1[], int ar2[], int m, int n){
	  for(int i=n-1; i>=0; i--){ 
          int j;
          int last = ar1[m-1]; 
	  for(j=m-2; j>=0 && ar1[j] > ar2[i]; j--) 
		  ar1[j+1] = ar1[j]; 
	        if(j != m-2 || last > ar2[i]){ 
	       		ar1[j+1] = ar2[i]; 
	      		ar2[i] = last; 
	    	} 
	    } 
    } 
    public static void main(String args[]){
    int ar1[] = {1, 5, 9, 10, 15, 20}; 
    int ar2[] = {2, 3, 8, 13}; 
    int m = ar1.length;
    int n = ar2.length; 
    merge(ar1, ar2, m, n); 
    for(int i=0; i<m; i++) {
        System.out.print(ar1[i]+" ");
    }
    for (int i=0; i<n; i++){
        System.out.print(ar2[i]+" ");
      }
    }
  }
