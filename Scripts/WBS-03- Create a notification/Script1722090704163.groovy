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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase("Test Cases/WBS-01_Login"), null)
WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/p_Notifications"))
WebUI.switchToFrame(findTestObject("Object Repository/User page/iframe_locator/iframe_locator"), 10)
 
// click on create new notification 
WebUI.click(findTestObject("Object Repository/Page_Notifications  Alarm.com/button_New Notification")) 
WebUI.waitForElementVisible(findTestObject("Object Repository/Page_Notifications  Alarm.com/div_Arming Event"), 30)
WebUI.click(findTestObject("Object Repository/Page_Notifications  Alarm.com/div_Arming Event")) 
// clear text in input field
WebUI.clearText(findTestObject("Object Repository/Page_Notifications  Alarm.com/input_Name_notication"))
 //enter name of notification
WebUI.setText(findTestObject("Object Repository/Page_Notifications  Alarm.com/input_Name_notication"), "Automation create by Thanh")
// select system actions : Arm stay / Arm Away/ DisArm
WebUI.check(findTestObject("Object Repository/Page_Notification  Alarm.com/label_Disarm (1)"))
// *** Add Recipients ***
WebUI.click(findTestObject("Object Repository/Page_Notification  Alarm.com/span_Add"))
WebUI.delay(5)
WebUI.sendKeys(findTestObject("Object Repository/Page_Notification  Alarm.com/txtContactSearch"), "Phu Lam")
WebUI.delay(3)
WebUI.click(findTestObject("Object Repository/Page_Notification  Alarm.com/div_Phu Lam"))
WebUI.click(findTestObject("Object Repository/Page_Notification  Alarm.com/button_Close"))
// click save 
WebUI.click(findTestObject("Object Repository/Page_Notification  Alarm.com/btn_Save"))
/// verify name of notification
WebUI.waitForElementPresent(findTestObject("Object Repository/Page_Notifications  Alarm.com/input_Add_form-control user-search first"), 30)
WebUI.setText(findTestObject("Object Repository/Page_Notifications  Alarm.com/input_Add_form-control user-search first"), "Automation create by Thanh")

try{
	String getText = WebUI.getText(findTestObject('Object Repository/Page_Notifications  Alarm.com/getText'));
    boolean  test1 = WebUI.verifyMatch(getText, "User1123", false);
	if(test1== true){
		System.out.println("Test case Passed")
     }
	}catch (Exception e){
		 System.out.println("Can't find User :user1233 ");
		 WebUI.takeScreenshot('D:\\Notification.jpg')
	 }


