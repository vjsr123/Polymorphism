package com.study.polymorphism;

public class SoftwareEngineerApp<SEngineer> {

	public static void main(String[] args)
	{
		
		
		BackEndDeveloper bd = new BackEndDeveloper();
		FrontEndDeveloper fd = new FrontEndDeveloper();
		doActivity(bd);
		System.out.println("---------------------------------------------");
		doActivity(fd);
		
	}
	static void doActivity(SoftwareEngineer s)
	{
		s.attendmeeting();
		s.doproject();
		if(s instanceof BackEndDeveloper)
		{
			((BackEndDeveloper)(s)).learnbackendlang();
		}
		else if (s instanceof FrontEndDeveloper)
		{
			((FrontEndDeveloper)(s)).learnfrontendlang();
		}
	}

}
