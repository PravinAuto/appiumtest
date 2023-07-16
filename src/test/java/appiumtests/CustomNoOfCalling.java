package appiumtests;

import java.net.MalformedURLException;

public class CustomNoOfCalling {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String mobile="7,2,5,0,6,3,4,9,4,2";
		TestApiDenoTest1 obj=new TestApiDenoTest1();
		int num_of_time=1;
		int num_of_second=50;
		
		for(int i =1; i<=num_of_time;i++) {
			obj.test(mobile,num_of_second);
		}
	}

}
