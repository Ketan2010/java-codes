// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Median_of_Two_Sorted_Array{  
    public static void main(String args[]){  
     int nums1[]={1,3};
     int nums2[]={2};
     System.out.println(findMedianSortedArrays(nums1,nums2));
    }  

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
        int n=nums2.length;
        float merged[]=new float [m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                merged[k]=nums2[j];
                k++;j++;
            }else{
                merged[k]=nums1[i];
                k++;i++;
            }
        }
        if(j<n){
            while(j<n){
                merged[k]=nums2[j];
                k++;j++;
            }
        }
         if(i<m){
            while(i<m){
                merged[k]=nums1[i];
                k++;i++;
            }
        }
        
        if((m+n)%2!=0){
            return merged[(m+n-1)/2];
        }else{
            return  (merged[(m+n)/2]+merged[((m+n)/2)-1])/2;
        } 
    }
}  


