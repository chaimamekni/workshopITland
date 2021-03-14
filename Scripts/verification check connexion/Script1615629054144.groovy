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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Test1_OR/Page_The Internet/a_Form Authentication'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/li_Form Authentication'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/div_Username'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/h4_This is where you can log into the secur_96f4ce'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/div_Username'))

WebUI.setText(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'), 'Tom Smith')

WebUI.setEncryptedText(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Password_password'), 'HLWV+ggC/GI=')

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'), 'tomsmith')

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/div_Username'))

WebUI.setText(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'), 'tomsmith')

WebUI.rightClick(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/body_Login Page  This is where you can log _e9e540'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.rightClick(findTestObject('Object Repository/Test1_OR/Page_The Internet/em_SuperSecretPassword'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/em_SuperSecretPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test1_OR/Page_The Internet/input_Password_password'), 'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The Internet/i_Login'))

