Feature: WWC Site Erişim Testi

  Scenario:WWC2 US001 WWC Site Erişim Testi

    Given Kullanici "homePage" adresine gider
    Then  İlgili login anasayafaya ulastigini dogrular
    Then  Tum menulerin goruntulendigini dogrular
    Then  Menu kisminda "OnlineAdmission" sekmesinin gorundugunu dogrular
    Then  Tıkladıgında "OnlineAdmission" formuna ulastigini dogrular
    Then  sayfayi kapatir

