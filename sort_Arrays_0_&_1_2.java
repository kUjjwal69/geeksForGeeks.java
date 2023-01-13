/*

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2


*/

class Solution
{
    public static void sort012(int a[], int n)
    {
        /* code here 
         int currentWord = 0;
  int nextWord = a.length-1;
  int i = 0;
  while( i<=nextWord){
      if(a[i]==0){
          int temp = a[currentWord];
          a[currentWord] = a[i];
          a[i] = temp;
          i++;
      }
      else if(a[i]==2){
        int  temp = a[nextWord];
          a[nextWord] = a[i];
          a[i] = temp; 
          nextWord--;
      }
      else{
          i++;
      }
    }*/
    // Arrays.sort(a);
    int countzero = 1;
        int countOne = 1;
        int countTwo = 1;
        for(int i = 0;i<n;i++){
            if(a[i]==0){
                countzero++;
            } else if (a[i]==1) {
                countOne++;
            } else if (a[i]==2) {
                countTwo++;
            }
        }
        int i =0;
        int count = 1;
       while(i<n){
           while(count<=countzero){
               a[i] = 0;
               count++;
               i++;
           }
           count = 1;
           i--;
           while (count <= countOne) {
               a[i] = 1;
               count++;
               i++;
           }
           count = 2;
           i--;
           while (count <= countTwo) {
               a[i] = 2;
               count++;
               i++;
           }
       }
    }
}
