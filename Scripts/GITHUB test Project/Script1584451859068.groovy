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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/Page_The worlds leading software developmen_e309d9/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'adrianpaskalis')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'zTR40iULaVtRYoSplaEtTw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/summary_New project_Header-link'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/span_Set status'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/input_Edit status_message'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/div_Working from home'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/button_Set status'))

WebUI.waitForElementClickable(findTestObject('Page_GitHub/button_Sign out'), 5)

WebUI.click(findTestObject('Object Repository/Page_GitHub/button_Sign out'))

WebUI.closeBrowser()

