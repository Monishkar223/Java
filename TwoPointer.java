import java.util.*;
class TwoPointer {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[] =  {1,2,3,4,5};
        int l=a.length;
        int left=0;
        int right=l-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        System.out.println(Arrays.toString(a));  
        }
    }
}
