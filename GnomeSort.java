package pgdp.algorithms;

import java.util.Arrays;

public class GnomeSort {
	public static void gnomeSort(int[] a) {
		int i = 0;
		while(i < a.length){
            if( i == 0 ){
				i++;
            }
			else if(a[i] >= a[i-1]){
				i++;
			}
			else{
				int temp = a[i];
				a[i] = a[i-1];
				a[i-1] = temp;
				i--;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] { 5, 2, 3, 1, 6, 0, 4 };
		gnomeSort(a);
		System.out.println(Arrays.toString(a));
	}

}
