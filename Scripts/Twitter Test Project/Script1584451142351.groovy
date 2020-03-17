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

WebUI.navigateToUrl('https://twitter.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Login on Twitter  Twitter/input_Phone email or username_sessionuserna_7e960a'), 
    'adrianpaskal')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login on Twitter  Twitter/input_Password_sessionpassword'), 
    'zru7VxHOemR39/ry+LHsXA==')

WebUI.click(findTestObject('Object Repository/Page_Login on Twitter  Twitter/div_Log in'))

WebUI.click(findTestObject('Object Repository/Page_(1) Home  Twitter/div_Whats happening_public-DraftStyleDefaul_097b31'))

WebUI.setText(findTestObject('Object Repository/Page_(1) Home  Twitter/div_Whats happening_notranslate public-Draf_f8a56b'), 
    '<div data-contents="true"><div class="" data-block="true" data-editor="514k8" data-offset-key="9g9d7-0-0"><div data-offset-key="9g9d7-0-0" class="public-DraftStyleDefault-block public-DraftStyleDefault-ltr" style=""><span data-offset-key="9g9d7-0-0"><br data-text="true"></span></div></div></div>')

WebUI.click(findTestObject('Object Repository/Page_(1) Home  Twitter/span_Notifications'))

WebUI.click(findTestObject('Object Repository/Page_Notifications  Twitter/span_More'))

WebUI.click(findTestObject('Object Repository/Page_Notifications  Twitter/span_Log out'))

WebUI.waitForElementClickable(findTestObject('Page_Twitter/div_Log out'), 5)

WebUI.click(findTestObject('Object Repository/Page_Twitter/div_Log out'))

WebUI.closeBrowser()

