package co.com.choucair.certificacion.retoautomatizacion.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class Home {
  public static  By LOGIN =By.xpath("//a[@id=\"login2\"]");
  public static final Target LOGIN2=Target.the("nav login").locatedBy("//a[@id=\"login2\"]");
  public static final Target LOGINUSERNAME=Target.the("usuario").locatedBy("//form/div/input[@id=\"loginusername\"]");
  public static final Target LOGINPASSWORD=Target.the("contrasenLog outa").locatedBy("//form/div/input[@id=\"loginpassword\"]");
  public static final Target BTNLOGIN=Target.the("aceptarform").locatedBy("//*[contains(@onclick, 'logIn()')]");
  public static final Target BTNLOGOU=Target.the("pasword").locatedBy("//a[@id=\"logout2\"]");
  public static final Target BTNLOGOUT=Target.the("nombre de usuario en el nav").locatedBy("//*[contains(@onclick, 'logOut()')]");

  public static final Target REGISTER=Target.the("nav register").locatedBy("//a[@id=\"signin2\"]");
  public static final Target REGISTERUSERNAME=Target.the("username").locatedBy("//form/div/input[@id=\"sign-username\"]");
  public static final Target REGISTERPASSWORD=Target.the("pasword").locatedBy("//form/div/input[@id=\"sign-password\"]");
  public static final Target BTNSIGNIN=Target.the("aceptarform").locatedBy("//*[contains(@onclick, 'register()')]\n");
  public static final Target CLOSEFORMREGISTER=Target.the("close").locatedBy("(//*[text()='Close'])[1]");

  public static final Target COMPRAPHONES=Target.the("modulo phones").locatedBy("// a[@id='itemc']");
  public static final Target COMPRAPHONE=Target.the("articulo phones").locatedBy("//div[@class='col-lg-9']/div/div[1]");


}


