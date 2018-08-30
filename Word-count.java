
    
import java.util.*;
import java.lang.*;
import java.io.*;

class Word-count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		str=str.trim();
		int cnt=1;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			cnt++;
			
		}
		System.out.print(cnt);
	}
}
		
