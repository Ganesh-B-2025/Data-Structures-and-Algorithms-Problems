package com.linearSearch;

public class LinearSearchForString {
	static boolean checkTargetInString(String name, char target) {
		for(int i=0; i<name.length(); i++) {			
			if(target == name.charAt(i)) 
				return true;
		}
		return false;
	}
public static void main(String[] args) {
	String name ="Ganesh";
	char target = 'g';
	boolean ans = checkTargetInString(name,target);
	if(ans)
		System.out.println("Found");
	else
		System.out.println("Not Found");
}
}
