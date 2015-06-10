package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumGmailComposeMailAction {

	public void loginGmailEmail(WebDriver driver) {
		driver.findElement(By.id("Email")).sendKeys("Entered UserName");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Enter Password");
		driver.findElement(By.id("PersistentCookie")).click();
		driver.findElement(By.id("signIn")).submit();
	}

	public void composeGmailMail(WebDriver driver) {
		// NOTE : Using Xpath for finding the element, as Gmail changes
		// ID and class of web element frequently which lead to fail of the
		// script.
		// click on composeMail button
		driver.findElement(
				By.xpath("//div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		// enter primaryMail ID
		driver.findElement(By.name("to")).sendKeys("hiring@coriolis.co.in");
		// click on cc button
		driver.findElement(
				By.cssSelector("[aria-label='Add Cc Recipients ‪(Ctrl-Shift-C)‬']")).click();
		// enter cc mail ID
		driver.findElement(By.name("cc")).sendKeys("shrikant.katkojwar@coriolis.co.in");
		// enter Subject
		driver.findElement(By.name("subjectbox")).sendKeys(
						"Compose mail Assignment"
								+ "\n"
								+ " Problem Statement: Write a program using Selenium to automate following use case.");
		// enter Mail body content
		driver.findElement(By.cssSelector("[role='textbox']")).sendKeys(
						"Name : Ankit Khandelwal"
								+ "\n"
								+ "Contact No : +919561658851"
								+ "\n"
								+ "GitHub Link : https://github.com/ankit89k/Selenium-G-mail-Flow ");
		driver.findElement(
				By.cssSelector("[aria-label='Send ‪(Ctrl-Enter)‬']")).click();
	}

}
