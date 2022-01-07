package clg;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;




public class package2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

int[] a= {1,2,3,4,5,4,6,7,5};
int[] b=new int[a.length];
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		if(a[i]==a[j]&&i!=j) {
			System.out.println("duplicate elements are "+a[i]);
		}
	}
}

 	}
}