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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_My Settings/a_My Leave'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/img'))

WebUI.setText(findTestObject('All leaves/Page_ApplyLeave/input__Start Date'), Start_Date)

WebUI.delay(5)

WebUI.setText(findTestObject('All leaves/Page_ApplyLeave/input__End Date'), End_Date)

WebUI.setText(findTestObject('Object Repository/Page_ApplyLeave/input_Reason_Reason'), Reason)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/button_Apply'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/button_Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/a_All Leave'))

WebUI.delay(5)

WebUI.click(findTestObject('All leaves/Page_Employee Leave/span_My Applied Leave'))

WebUI.click(findTestObject('All leaves/Page_Employee Leave/svg_My Applied Leave_slds-icon slds-icon-text-default slds-icon_xx-small'))

WebUI.click(findTestObject('All leaves/Page_Employee Leave/Employee_Leave_Link'))

WebUI.verifyElementText(findTestObject('All leaves/Page_Employee Leave EL-4285/span_Applied'), 'Applied')

System.out.println('The Leave is Successfully Applied')

WebUI.closeBrowser()

