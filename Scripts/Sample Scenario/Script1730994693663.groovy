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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://blazedemo.com/index.php')

WebUI.click(findTestObject('Object Repository/Test Script/Page_BlazeDemo/input_Choose your destination city_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Test Script/Page_BlazeDemo - reserve/input_472.56_btn btn-small'))

WebUI.setText(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_Name_inputName'), 'Swadha')

WebUI.setText(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_Address_address'), 'XXX')

WebUI.setText(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_City_city'), 'Bangalore')

WebUI.setText(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_State_state'), 'Karnataka')

WebUI.setText(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_Credit Card Number_creditCardNumber'), 
    '8655788******')

WebUI.setText(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_Name on Card_nameOnCard'), 'Swadha')

WebUI.click(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_Remember me_rememberMe'))

WebUI.click(findTestObject('Object Repository/Test Script/Page_BlazeDemo Purchase/input_Remember me_btn btn-primary'))

WebUI.closeBrowser()

