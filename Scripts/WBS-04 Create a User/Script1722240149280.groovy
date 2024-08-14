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
//WebUI.callTestCase(findTestCase("Test Cases/WBS-01_Login"), null)
// Navigate User page from home page

WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/p_Users"))
WebUI.click(findTestObject("Object Repository/Page_New User  Alarm.com/button_Add user"))
// enter infomation of user 
WebUI.setText(findTestObject("Object Repository/Page_New User  Alarm.com/input_First Name_ember790-first-name"), "Automation")
WebUI.setText(findTestObject("Object Repository/Page_New User  Alarm.com/input_Last Name_ember790-last-name"), "User")
WebUI.click(findTestObject("Object Repository/Page_New User  Alarm.com/button_Create"))
WebUI.click(findTestObject("Object Repository/Page_Device Access  Alarm.com/span_Generate Code"))
WebUI.click(findTestObject("Object Repository/Page_Device Access  Alarm.com/div_Panel"))
WebUI.click(findTestObject("Object Repository/Page_Device Access  Alarm.com/button_Save"))
// verify user created or not?
boolean verifyUserCreated = WebUI.verifyElementPresent(findTestObject("Object Repository/Page_User Profile  Alarm.com/h2_Automation User"), 10)
if (verifyUserCreated == true ){
	System.out.println("New user created successfully");
	 }
WebUI.closeBrowser()
 