Feature: WWC31 US054 Parent Login Testi

  Scenario:WWC2 US001 WWC Site Erişim Testi

    Given Kullanici "homePage" adresine gider
    Then  anasayafadaki "Login" butonuna tiklar
    Then  Username ve Password formunun goruntulendigini dogrular
    Then  Login sayfasindaki Sign In butonunun gorundugunu dogrular
    Then  Username ve Password Box larin tiklanabilir oldugunu dogrular
    And  sayfayi kapatir

