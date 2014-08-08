package test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XxxxxCreateUser {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://adobeid-na1-stg1.services.adobe.com/renga-idprovider/pages/create_account?client_id=CreativeCloudDownloadWorkflowWeb1&callback=https%3A%2F%2Fims-na1-stg1.adobelogin.com%2Fims%2Fadobeid%2FCreativeCloudDownloadWorkflowWeb1%2FAdobeID%2Ftoken%3Fredirect_uri%3Dhttps%253A%252F%252Fstage.adobecc.com%252Fplans%2523from_ims%253Dtrue%2526old_hash%253D%2526client_id%253DCreativeCloudDownloadWorkflowWeb1%2526scope%253DAdobeID%25252Copenid%25252Cgnav%25252Ccreative_cloud%25252Cread_organizations%25252Cadditional_info.screen_name%25252Cadditional_info.secondary_email%2526api%253Dauthorize%26state%3D%257B%2522ac%2522%253A%2522creative.adobe.com%2522%252C%2522av%2522%253Anull%252C%2522di%2522%253Anull%252C%2522mc%2522%253Anull%252C%2522pl%2522%253Anull%257D%26scope%3DAdobeID%252Copenid%252Cgnav%252Ccreative_cloud%252Cread_organizations%252Cadditional_info.screen_name%252Cadditional_info.secondary_email&client_redirect=https%3A%2F%2Fims-na1-stg1.adobelogin.com%2Fims%2Fredirect%2FCreativeCloudDownloadWorkflowWeb1%3Fclient_redirect%3Dhttps%253A%252F%252Fstage.adobecc.com%252Fplans%2523from_ims%253Dtrue%2526old_hash%253D%2526client_id%253DCreativeCloudDownloadWorkflowWeb1%2526scope%253DAdobeID%25252Copenid%25252Cgnav%25252Ccreative_cloud%25252Cread_organizations%25252Cadditional_info.screen_name%25252Cadditional_info.secondary_email%2526api%253Dauthorize%26state%3D%257B%2522ac%2522%253A%2522creative.adobe.com%2522%252C%2522av%2522%253Anull%252C%2522di%2522%253Anull%252C%2522mc%2522%253Anull%252C%2522pl%2522%253Anull%257D&denied_callback=https%3A%2F%2Fims-na1-stg1.adobelogin.com%2Fims%2Fdenied%2FCreativeCloudDownloadWorkflowWeb1%3Fredirect_uri%3Dhttps%253A%252F%252Fstage.adobecc.com%252Fplans%2523from_ims%253Dtrue%2526old_hash%253D%2526client_id%253DCreativeCloudDownloadWorkflowWeb1%2526scope%253DAdobeID%25252Copenid%25252Cgnav%25252Ccreative_cloud%25252Cread_organizations%25252Cadditional_info.screen_name%25252Cadditional_info.secondary_email%2526api%253Dauthorize%26response_type%3Dtoken%26state%3D%257B%2522ac%2522%253A%2522creative.adobe.com%2522%252C%2522av%2522%253Anull%252C%2522di%2522%253Anull%252C%2522mc%2522%253Anull%252C%2522pl%2522%253Anull%257D%26scope%3DAdobeID%252Copenid%252Cgnav%252Ccreative_cloud%252Cread_organizations%252Cadditional_info.screen_name%252Cadditional_info.secondary_email&display=web_v2&locale=en_US&relay=337798d9-37cb-4767-b8dd-e041cd7713fe&state=%7B%22ac%22%3A%22creative.adobe.com%22%2C%22av%22%3Anull%2C%22di%22%3Anull%2C%22mc%22%3Anull%2C%22pl%22%3Anull%7D&flow=true&flow_type=token&dc=false&force_marketing_permission=true");
			Thread.sleep(5000);
			// Input User Name
			driver.findElement(By.id("first_name")).clear();
			driver.findElement(By.id("first_name")).sendKeys("test");
			Thread.sleep(1000);

			// Input User Name
			driver.findElement(By.id("last_name")).clear();
			driver.findElement(By.id("last_name")).sendKeys("test");
			Thread.sleep(1000);

			// Input User Name
			driver.findElement(By.id("email_address")).clear();
			driver.findElement(By.id("email_address")).sendKeys(email);
			Thread.sleep(1000);
			// Input User Name
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("Kz2009{}");
			Thread.sleep(1000);
			
			WebElement dropDownListBox = driver.findElement(By.id("country"));
			Select clickThis = new Select(dropDownListBox);
			//clickThis.selectByValue("us");
			
			 dropDownListBox = driver.findElement(By.id("month"));
			 clickThis = new Select(dropDownListBox);
			clickThis.selectByValue("4");
			
			
			 dropDownListBox = driver.findElement(By.id("day"));
			 clickThis = new Select(dropDownListBox);
			 clickThis.selectByValue("22");
			
			  dropDownListBox = driver.findElement(By.id("year"));
			  clickThis = new Select(dropDownListBox);
			clickThis.selectByValue("1977");
			
			// Input User Name
		 
			driver.findElement(By.id("create_account")).click();
			Thread.sleep(11000);

			System.out.println("account details : " + email +"    password : Kz2009{}");
			
			driver.close();
		} catch (Exception e) {

			throw e;
		}
	}
}
