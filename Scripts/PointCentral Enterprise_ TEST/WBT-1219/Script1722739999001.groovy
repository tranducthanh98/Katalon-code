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
// login to custommer site
WebUI.callTestCase(findTestCase('Test Cases/PointCentral Enterprise_ TEST/login_PointCentral account'), null)

// Navigate to User Page > Manage login
WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/p_Users"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login _ Tab"))
WebUI.switchToFrame(findTestObject("Object Repository/User page/iframe_locator/iframe_locator"), 30)
WebUI.delay(10)
// Click on button Group logoin
WebUI.click(findTestObject("Object Repository/User page/btn_AddGroupLogin"))
WebUI.delay(10)
WebUI.click(findTestObject("Object Repository/User page/radio_ExistingLogin"))
WebUI.click(findTestObject("Object Repository/User page/btn_Next"))

WebUI.setText(findTestObject("Object Repository/User page/Manage Login Page/txt_Login Name"), "B518_LTR_TPP")
WebUI.setText(findTestObject("Object Repository/User page/Manage Login Page/txt_Email Address"), "tppttran@alarm.com")

//choose role is Custom from dropdown menu
WebUI.selectOptionByIndex(findTestObject("Object Repository/User page/Manage Login Page/Role_Custom"),0)
boolean verifyRoleIsCustom = WebUI.verifyOptionSelectedByIndex(findTestObject("Object Repository/User page/Manage Login Page/Role_Custom") ,0 ,30, FailureHandling.STOP_ON_FAILURE)
if (verifyRoleIsCustom == true) {
 System.out.println("Role Custom selected");
} else {
	System.out.println(" Role Custom not selected");
}
// Select all the permissions with Read Only Access
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Location"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Users"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Notification"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Reports"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Logins"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Activitys"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Settings"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Lock_control"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Thermonstats"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/Management Permissions_section/Vehicles"))

// Select Group Access and click Save Button
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/GroupAccess_section/allGroup"))
WebUI.click(findTestObject("Object Repository/User page/Manage Login Page/btn-Save"))

// verify if the user is dispalyed or not
WebUI.switchToDefaultContent()
WebUI.delay(5)
WebUI.switchToFrame(findTestObject("Object Repository/User page/iframe_locator/iframe_locator"), 30)
WebUI.delay(10)
WebUI.setText(findTestObject("Object Repository/User page/Search_"), "B518_LTR_TPP")
 boolean VerifyElementChange=WebUI.verifyElementPresent(findTestObject("Object Repository/User page/Verify_elementPresent"), 10)
 if (VerifyElementChange== true) {
	 System.out.println("User change to role custom");
	 
 }else {
	 System.out.println("User don't change to role custom");
	  }