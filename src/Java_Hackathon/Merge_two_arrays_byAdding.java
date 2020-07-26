//Q32. You are given two sorted arrays, A and B, and A has a large enough 
//bu#er at the end to hold B. Write a method to merge B into A in sorted order. 
package Java_Hackathon;

public class Merge_two_arrays_byAdding {

	void moveToEnd(int mPlusN[], int size)  
    { 
        int i, j = size - 1; 
        
        for (i = size - 1; i >= 0; i--)  
        { 
            if (mPlusN[i] != -1)  
            { 
                mPlusN[j] = mPlusN[i]; 
                j--; 
            } 
        } 
    } 
  
    void merge(int mPlusN[], int N[], int m, int n)  
    { 
        int i = n; 
          
        int j = 0; 
          
        int k = 0; 
          
        while (k < (m + n))  
        { 
          
            if ((i < (m + n) && mPlusN[i] <= N[j]) || (j == n))  
            { 
                mPlusN[k] = mPlusN[i]; 
                k++; 
                i++; 
            }  
            else 
            { 
                mPlusN[k] = N[j]; 
                k++; 
                j++; 
            } 
        } 
    } 
  
    void printArray(int arr[], int size)  
    { 
        int i; 
        System.out.println("Second array merged into the first one:-");
        for (i = 0; i < size; i++)  
            System.out.print(arr[i] + " "); 
  
        System.out.println(""); 
    } 
  
    public static void main(String[] args)  
    { 
    	Merge_two_arrays_byAdding mergearray = new Merge_two_arrays_byAdding(); 
          
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20}; 
        
        System.out.println("The first array:-");

        for(int i=0;i<mPlusN.length;i++)
        {
        System.out.print(mPlusN[i]+" ");
        }
        System.out.println("\n");

        int N[] = {5, 7, 9, 25}; 
        
        System.out.println("The second array:-");
        
        for(int i=0;i<N.length;i++)
        {
            System.out.print(N[i]+" ");
        }
        System.out.println("\n");

        int n = N.length; 
        
        int m = mPlusN.length - n; 
  
        mergearray.moveToEnd(mPlusN, m + n); 
  
        mergearray.merge(mPlusN, N, m, n); 
  
        mergearray.printArray(mPlusN, m + n); 
    } 
} 
  

