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

WebUI.navigateToUrl('https://moodle.fti.ukdw.ac.id/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Media Pembelajaran Online Universitas _2bbdd2/input_Username_username'), 
    'adrianpaskal')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Media Pembelajaran Online Universitas _2bbdd2/input_Password_password'), 
    '2yL06n4/jRrnXonmxwAp9zNoHmIjYlFJ')

WebUI.click(findTestObject('Object Repository/Page_Media Pembelajaran Online Universitas _2bbdd2/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Pengujian Perangkat Lunak 2020'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Pengujian Perangkat Lunak 2020'))

WebUI.click(findTestObject('Object Repository/Page_Course Pengujian Perangkat Lunak 2020/a_Adrian Paskalis'))

WebUI.waitForElementClickable(findTestObject('Page_Course Pengujian Perangkat Lunak 2020/span_Log out'), 5)

WebUI.click(findTestObject('Object Repository/Page_Course Pengujian Perangkat Lunak 2020/span_Log out'))

WebUI.closeBrowser()

