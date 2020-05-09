import org.junit.Test;

import java.util.Arrays;

public class Square {



    @Test
    public void test(){

        int[] a ={1,0,5,0,0,6,7};
        System.out.println(Arrays.toString(moveright(a)));
//        System.out.println(a[a.length-1-1]);
    }
    /** moving zero to right*/
    public int[] find(int[] n){

        int point = 0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                n[point]=n[i];
                point++;
            }
        }

        while (point < n.length)
            n[point++] = 0;
        return n;
    }

    // move zero to left

    public int[] moveleft(int[] a){

        int left =0, right = a.length-1;
        while(left<right){
            if(a[left]!=0 && a[right]==0){
                int temp = a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }else if(a[left]!=0 && a[right]!=0){
                right--;
            }else if(a[left]==0){
                left++;
            }
        }
        return a;
    }

    // move zero to right

    public int[] moveright(int[] a){
        int left =0,right =a.length-1;

        while(left<right){
            if(a[right]!=0 && a[left]==0){
                int temp = a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }else if(a[left]!=0 && a[right]!=0){
                left++;
            }else if(a[right]==0){
                right--;
            }
        }
        return a;
    }
}
