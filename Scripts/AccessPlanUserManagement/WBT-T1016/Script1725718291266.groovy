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

WebUI.callTestCase(findTestCase("Test Cases/AccessPlanUserManagement/login_Customer site"), null)
WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/parentGroup_Dropdowns"))
WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/icon_expand_enteriseGroup"))
WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/select_SS_system"))
WebUI.delay(5)
WebUI.click(findTestObject("Object Repository/Page_Home  Alarm.com/p_Automation"))
WebUI.click(findTestObject("Object Repository/page_Automation/btn_closeDialog"))
WebUI.verifyElementPresent(findTestObject("Object Repository/page_Automation/automation_title"), 10)
// tab Scenes and verify 
WebUI.click(findTestObject("Object Repository/page_Automation/scenes_tab"))
String getUrlScenes = WebUI.getUrl()
String attribute= WebUI.getAttribute(findTestObject("Object Repository/page_Automation/scenes_tab"), 'class')
WebUI.verifyMatch(attribute, 'active ', false)
if(WebUI.verifyMatch(attribute, 'active ', false) == true) {
	System.out.println("Scenes is actived");
}else {
	System.out.println("Scenes is not actived");
}
/*try {
	if (getUrlScenes == true){
	System.out.println("Scenes is actived");
	}else {
		System.out.println("Scenes is not actived");
	}
	//assert getUrlScenes == true
	System.out.println("Scenes is actived");
}catch(Exception e){
	if(attribute == "active") {
		System.out.println("Scenes is actived");
	}else {
		System.out.println("Scenes is not actived");
	}
	
}*/



