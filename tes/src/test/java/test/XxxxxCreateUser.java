package test;

import java.util.Random;

public class XxxxxCreateUser {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//mac first push
			e.printStackTrace();
		}

	}

	public static void test() throws Exception {
		try {
			
			String email = "yadlapal+";
			
			Random rand = new Random();
			int val = Math.abs(rand.nextInt());
					
			email = email +val+"@adobetest.com";
			
			System.out.println("account details : " + email +"    password : Kz2009{}");
		 
			
			// I 
		} catch (Exception e) {

			throw e;
		}
	}
}
