/**
 * program to check the string is polindrome or not
 * @author vandana
 */
package com.techzenure.vandana.day7;

public class Palindrome {
    boolean checkPlindrome(String str)
    {
    	char[] a=str.toCharArray();
    	int i=0,j=a.length-1;
    	while(i<j)
    	{
    		if(a[i]!=a[j]) return false;
    		i++;
    		j--;
    	}
    	return true;   	
    }
}
