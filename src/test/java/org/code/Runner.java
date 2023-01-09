package org.code;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({ B.class, A.class, C.class })

public class Runner {

	@Test
	public void tc1() {

		Result res = JUnitCore.runClasses(A.class, B.class, C.class);

		int runCount = res.getRunCount();
		System.out.println("Run count: " + runCount);
		System.out.println("Run Time: " + res.getRunTime());
		System.out.println("Ignore Count: " + res.getIgnoreCount());
		System.out.println("Failure Count: " + res.getFailureCount());

		List<Failure> failures = res.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}

	}

}
