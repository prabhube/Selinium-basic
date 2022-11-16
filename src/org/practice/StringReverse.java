package org.practice;

public class StringReverse {
	public static void main(String[] args) {
		String rev="";
		String s= " i am prabhu";
	   int length = s.length();
		for(int i=length-1;i>=0;i--)
		{
	char at = s.charAt(i);
	rev=rev+at;
		System.out.print(rev);
		}
	}
}
