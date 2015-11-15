# junit5-maven-consumer

The `junit5-maven-consumer` project demonstrates how to run tests based on the JUnit 5 prototype using Maven.

## Executing JUnit 5 Tests

Invoking `mvn clean test` from the command line will execute all tests in `com.example.project`, resulting in output similar to the following:

```
Test execution started. Number of static tests: 2
Engine started: junit5
Test started:     My 1st JUnit 5 test! 😎 [junit5:com.example.project.FirstTest#myFirstTest(java.lang.String)]
Test succeeded:   My 1st JUnit 5 test! 😎 [junit5:com.example.project.FirstTest#myFirstTest(java.lang.String)]
Test skipped:     mySecondTest [junit5:com.example.project.SecondTest#mySecondTest()]
                  => Exception:   Skipped test method [void com.example.project.SecondTest.mySecondTest()] due to failed condition
Engine finished: junit5
Test execution finished.

Test run finished after 52 ms
[         2 tests found     ]
[         1 tests started   ]
[         1 tests skipped   ]
[         0 tests aborted   ]
[         0 tests failed    ]
[         1 tests successful]

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

If you comment out the `@Disabled` annotation on `SecondTest#mySecondTest()`, you will then see the build fail with output similar to the following:

```
Test execution started. Number of static tests: 2
Engine started: junit5
Test started:     My 1st JUnit 5 test! 😎 [junit5:com.example.project.FirstTest#myFirstTest(java.lang.String)]
Test succeeded:   My 1st JUnit 5 test! 😎 [junit5:com.example.project.FirstTest#myFirstTest(java.lang.String)]
Test started:     mySecondTest [junit5:com.example.project.SecondTest#mySecondTest()]
Test failed:      mySecondTest [junit5:com.example.project.SecondTest#mySecondTest()]
                  => Exception:   2 is not equal to 1 ==> expected:<2> but was:<1>
Engine finished: junit5
Test execution finished.

Test run finished after 39 ms
[         2 tests found     ]
[         2 tests started   ]
[         0 tests skipped   ]
[         0 tests aborted   ]
[         1 tests failed    ]
[         1 tests successful]

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```

### Current Limitations

- It will only execute tests in package `com.example.project` and subpackages.
- Even though the build will fail if a test fails, the results will not be included in the test report as generated by Maven Surefire.