package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ProjectModule {

	@BeforeClass
	public void openProject() {
			Reporter.log("openProject", true);
	}

	@AfterClass
	public void closeProject() {
			Reporter.log("closeProject", true);
	}
}
