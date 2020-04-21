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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as Webdriver
import org.openqa.selenium.WebElemennt as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory 

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/tokobuah/index.php/admin/login')

WebUI.click(findTestObject('Object Repository/Page_Login Admin/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_Login Admin/input_Email_email'), 'dian')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Admin/input_Password_password'), 'MMS/zmTQxAM=')

WebUI.click(findTestObject('Object Repository/Page_Login Admin/input_Lupa Password_btn btn-success w-100'))

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_Products'))

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_List Product'))

String expectedValue = 'Buah Naga'

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

table: for (int i = 0; i < Rows.size(); i++) {
	List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

	for (int j = 0; j < Cols.size(); j++) {
		if (Cols.get(j).getText().equalsIgnoreCase(expectedValue)) {
			WebUI.comment(('kata ' + expectedValue) + ' ada')

			break
		}
	}
}

