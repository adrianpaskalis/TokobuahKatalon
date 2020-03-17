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

WebUI.navigateToUrl('https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin')

WebUI.setText(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_key'), 
    'adrian.paskalis@si.ukdw.ac.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/input_Welcome Back_session_password'), 
    '/0lkEwNbM9TbJIg+c48wFw==')

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Login Sign in  LinkedIn/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn/span_Send confirmation link'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn/svg'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn/path'))

WebUI.click(findTestObject('Object Repository/Page_LinkedIn/path_1'))

WebUI.waitForElementClickable(findTestObject('Page_LinkedIn/a_Sign out'), 0)

WebUI.click(findTestObject('Object Repository/Page_LinkedIn/a_Sign out'))

WebUI.closeBrowser()

