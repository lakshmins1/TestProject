package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  Reporter.log("hi",true);
  }
  @Test
  public void h()
  {
	  Reporter.log("kkk", true);
  }
}
