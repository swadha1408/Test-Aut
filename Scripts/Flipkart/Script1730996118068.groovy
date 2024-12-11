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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/a_New to Flipkart Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_669135'))

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11'), 
    '86')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '866')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '8667')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    '86675')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    '866750')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    '8667506')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    '86675068')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    '866750686')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Sign up with your mobile number to ge_a8c6e9_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    '8667506861')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/button_CONTINUE'))

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Resend_r4vIwl _5BVqVB BVDqf'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Resend_r4vIwl _5BVqVB BVDqf_1'), 
    '16')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Resend_r4vIwl _5BVqVB BVDqf_1_2'), 
    '169')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Resend_r4vIwl _5BVqVB BVDqf_1_2_3'), 
    '1692')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Resend_r4vIwl _5BVqVB BVDqf_1_2_3_4'), 
    '16923')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input_Resend_r4vIwl _5BVqVB BVDqf_1_2_3_4_5'), 
    '169235')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/button_Signup'))

WebUI.closeBrowser()

