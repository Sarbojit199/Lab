/*Write a Java program to find common elements from three sorted (in 
non-decreasing order) arrays*/

package Array;

public class commonthreesorted {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};		//taking three arrays
		int arr1[]= {2,3,4,5,6};
		int arr2[]= {3,4,5,6,7};
		int i=0,j=0,k=0;

		int n1=arr.length;
		int n2=arr1.length;
		int n3=arr2.length;
		
		while(i<n1 &&j<n2 &&k<n3) {
			if(arr[i]==arr1[j] && arr1[j]==arr2[k]) {	//condition if common in them
				System.out.print(arr[i]+" ");	
				i++;j++;k++;		//go for next iteration
			}
			else if(arr[i]<arr1[j]) {		//array is sorted and if first elemnt is already smaller in first array 
				i++;					
			}
			else if(arr1[j]<arr2[j]) {
				j++;
			}
			else {
				k++;
			}
		}

	}

}
