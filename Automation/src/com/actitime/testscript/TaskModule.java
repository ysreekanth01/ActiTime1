package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TaskModule {
	@BeforeClass
	public void openTask() {
			Reporter.log("openTask", true);
	}

	@AfterClass
	public void closeTask() {
			Reporter.log("closeTask", true);
	}

}
