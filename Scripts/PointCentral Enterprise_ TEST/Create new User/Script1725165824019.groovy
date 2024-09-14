
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
// login to Pointcentral account
WebUI.callTestCase(findTestCase('Test Cases/PointCentral Enterprise_ TEST/login_PointCentral account'), null)
// navigate User tab
WebUI.click(findTestObject('Object Repository/Page_Home  Alarm.com/p_Users'))
//WebUI.switchToFrame(findTestObject('Object Repository/User page/iframe_locator/iframe_locator'), 10)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_New User  Alarm.com/button_Add user'))
// enter user information
WebUI.setText(findTestObject("Object Repository/Page_New User  Alarm.com/input_FirstName"),"Automation ")
WebUI.setText(findTestObject('Object Repository/Page_New User  Alarm.com/input_LastName'), 'User')
WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_New User  Alarm.com/dropDown_menu_userType'),'Manager', false)
WebUI.click(findTestObject('Object Repository/Page_New User  Alarm.com/button_Create'))



