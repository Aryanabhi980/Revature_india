package day5;
import java.util.*;

public class Tempo {
	
	public static String lovePalidromes(String str) {
	String result= "Z";
	int i=str.length();
	StringBuilder sb = new StringBuilder();
	sb.append(Character.toString(str.charAt(i-1))).append(str);
	if(sb.toString().equals(sb.reverse().toString()))
	{
		result =Character.toString(str.charAt(i-1));
	}
	return result;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(lovePalidromes(str));
	}
	
	}


