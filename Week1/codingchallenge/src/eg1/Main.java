package eg1;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
	

	public static String getMissingValuesOfMagicArray(int N,int X,int[] B) {
		
		int result = -404;
		for(int i=0;i<N;i++)
		{
			if(B[i]==-1) {
				result=0;
				result =((X+i+1)*(X+i+2)*(X+i+3))/3;
				B[i]= result;
			}
		}
		String res = "";
		for(int i=0;i<N;i++) {
			res +=B[i]+" ";
		}
		return res;
	}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int X = sc.nextInt();
			int[] B = new int[N];
			for(int i=0;i<N;i++)
			{
				B[i]=sc.nextInt();
			}
			sc.close();
			System.out.print(getMissingValuesOfMagicArray(N,X,B));
		}
	}


