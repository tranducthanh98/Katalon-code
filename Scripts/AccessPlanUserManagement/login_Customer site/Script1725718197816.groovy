import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String UserName = "tppiqtest6";
String Password = "TPPaccount@2022";

try{
	WebUI.openBrowser("https://www.alarm.test-us.adcinternal.com/login.aspx")
	WebUI.maximizeWindow()
	WebUI.waitForPageLoad(5)
	WebUI.setText(findTestObject("Object Repository/Page_Customer Login/txtUserName"), UserName)
	WebUI.setText(findTestObject("Object Repository/Page_Customer Login/txtPassword"), Password)
	WebUI.click(findTestObject("Object Repository/Page_Customer Login/btn-Login"))
	WebUI.delay(10)
	String currentUrl = WebUI.getUrl()
	System.out.println(currentUrl)
	WebUI.verifyMatch(currentUrl, "https://www.alarm.test-us.adcinternal.com/web/system/enterprise/locations/summary", false)
	System.out.println("login successfully")
	}catch(Exception e)
	{
	System.out.println("test cased failed")
	WebUI.takeScreenshot('D:\\image for Automation report\\loginPage.jpg')
	}