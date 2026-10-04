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

WebUI.navigateToUrl(GlobalVariable.baseUrl, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Web_Saucelab/LoginPage/div_header'))

WebUI.click(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_user-name'))

WebUI.setText(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_password'))

WebUI.setText(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_password'), 'secret_sauce')

WebUI.click(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_login-button'))

WebUI.waitForElementVisible(findTestObject('Web_Saucelab/inventory/div_Sauce Labs Backpackcarry'), 30)

WebUI.closeBrowser()

