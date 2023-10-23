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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/Username_field'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/Password_field'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/button_login'))

WebUI.click(findTestObject('Page_Swag Labs/Title item Labs Backpack'))

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Cart pop up number'), 0)

WebUI.click(findTestObject('Page_Swag Labs/Cart Icon'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Title item Labs Backpack'), 0)

WebUI.click(findTestObject('Page_Swag Labs/button Checkout'))

WebUI.setText(findTestObject('Page_Swag Labs/firstName field'), 'Fajar')

WebUI.setText(findTestObject('Page_Swag Labs/lastName field'), 'Irawan')

WebUI.setText(findTestObject('Page_Swag Labs/postalCode field'), '15151')

WebUI.click(findTestObject('Page_Swag Labs/button Continue'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/order information'), 0)

WebUI.click(findTestObject('Page_Swag Labs/button Finish'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Text Checkout Complete'), 0)

WebUI.closeBrowser()

