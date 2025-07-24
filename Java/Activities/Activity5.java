package Activity;

abstract class TestCase {
 String testName;

 abstract void setTestName(String s);
 String getTestName() {
     return testName;
 }
}
class MyTestCase extends TestCase {
 public void setTestName(String s) {
     testName = s;
 }
}

public class Activity5 {
 public static void main(String[] args) {
     MyTestCase newTest = new MyTestCase();
     String testName = "Login Functionality Test";
     newTest.setTestName(testName);
     System.out.println("The test case name is: " + newTest.getTestName());
 }
}

