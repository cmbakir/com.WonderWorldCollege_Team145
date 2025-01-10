package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ParentPage;
import utilities.ConfigReader;

public class ParentStepDefinitions {

ParentPage parentPage=new ParentPage();
HomePage homePage=new HomePage();



    @Given("Kullanici homePage adresine gider")
    public void kullanici_adresine_gider() {

    }
    @Then("anasayafadaki {string} butonuna tiklar")
    public void anasayafadaki_butonuna_tiklar(String string) {

    }
    @Then("Username ve Password formunun goruntulendigini dogrular")
    public void username_ve_password_formunun_goruntulendigini_dogrular() {

    }
    @Then("Login sayfasindaki Sign In butonunun gorundugunu dogrular")
    public void login_sayfasindaki_sign_in_butonunun_gorundugunu_dogrular() {

    }
    @Then("Username ve Password Box larin tiklanabilir oldugunu dogrular")
    public void username_ve_password_box_larin_tiklanabilir_oldugunu_dogrular() {

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }







}
