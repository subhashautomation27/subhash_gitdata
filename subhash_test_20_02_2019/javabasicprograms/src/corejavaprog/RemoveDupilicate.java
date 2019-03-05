package corejavaprog;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupilicate {
	
	

	public static void main(String[] args) {
		
		String name="hi java hi"; //hi jav
		
		System.out.println(remove(name));
		
		
	}
		public static  String remove(String name)
		{
			Set<Character> set=new HashSet<>();
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < name.length(); i++) 
			{
				Character c=name.charAt(i);
				if(!set.contains(c))
				{
					set.add(c);
					sb.append(c);
				}
			}
			return sb.toString();
		}
		
       
	}

