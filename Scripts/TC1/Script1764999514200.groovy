import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

TestObject makeTestObject(String id, String xpath) {
	TestObject tObj = new TestObject(id)
	tObj.addProperty("xpath", ConditionType.EQUALS, xpath)
	return tObj	
}

Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path html = projectDir.resolve("./page.html")
String url = html.toFile().toURI().toURL().toExternalForm()

// open the page
WebUI.openBrowser('')
//WebUI.maximizeWindow()
WebUI.setViewPortSize(800, 600)
WebUI.navigateToUrl(url)

// click the button
TestObject button = makeTestObject("button", "//button[@id='dropdownMenuButton1']")
WebUI.click(button)

// make sure the input field is present
TestObject inputField = makeTestObject("inputField", "//input[@type='text']")
WebUI.verifyElementPresent(inputField, 10)
WebUI.delay(3)

// type a text 'ba' into the input field
WebUI.sendKeys(inputField, "ba")

//  click the 1st <li> element
li1 = makeTestObject("li", "//ul/li[1]")
WebUI.verifyElementPresent(li1, 10)
WebUI.click(li1)

// verify if the input field is filed with "banana"
TestObject valueDisplay = makeTestObject("valueDisplay", "//*[@id='valueDisplay']")
assert WebUI.getText(valueDisplay) == "banana"

//WebUI.closeBrowser() 

