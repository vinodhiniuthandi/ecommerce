package com.niit.util;

public class Util {

	/**
	 * This method is used to remove cammaa from
	 * product, category, suppliers which are 
	 * appending unnecessarily while creating it.
	 * 
	 * @param st
	 * @param ch1
	 * @param ch2
	 * @return
	 */
	public String replace(String st, String aaa, String aaaa)
	{
		
	  return	st.replace(aaa,aaaa);
		
	}
	
	
	public static void main(String[] args) {
		Util u = new Util();
		
		String newString =   u.replace(",PRD", ",", "");
		System.out.println(newString);
	}
	

}
