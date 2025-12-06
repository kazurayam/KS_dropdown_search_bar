import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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
WebUI.setViewPortSize(800,600)
WebUI.navigateToUrl(url)

// click the button
TestObject button = makeTestObject("button", "//button[@id='dropdownMenuButton1']")
WebUI.click(button)

WebUI.delay(3)
WebUI.closeBrowser() 

