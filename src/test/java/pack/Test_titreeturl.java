package pack;

import org.testng.annotations.Test;

public class Test_titreeturl extends BASE {
	@Test()
	public void Test1() {
		// TODO Auto-generated method stub
		System.out.println("the title is " + driver.getTitle());
		System.out.println("the URL is " + driver.getCurrentUrl());
	}



}
