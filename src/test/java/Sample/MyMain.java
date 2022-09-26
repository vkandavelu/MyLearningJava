package Sample;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyMain {

    public static void main(String[] args) {

        remotewebdriver obj = new chrome();
        obj.get();

    }
}
interface searchcont
{

    void finelemen();

    void findelemens();

}
 interface WEbdriver extends searchcont
{
  void get();
}
class remotewebdriver implements WEbdriver
{

    @Override
    public void finelemen() {

    }

    @Override
    public void findelemens() {

    }

    @Override
    public void get() {

    }
}
class chrome extends remotewebdriver
{
  void chromeMethod()
  {

  }
}
class firefox extends remotewebdriver
{
    void firfoxMethod()
    {

    }
}
