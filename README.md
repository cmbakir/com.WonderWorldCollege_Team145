**** Wonder World College Eğitim Platformu Test Planı ****

Giriş

Wonder World College platformundaki dört ana panelin (Admin, Teacher, Student, Parent) işlevselliğini test etmek için hazırlanmıştır. Testler, kullanıcı gereksinimlerine ve kabul kriterlerine uygun olarak sistemin doğru çalıştığını doğrulamayı amaçlar. Plan, keşif  ve otomasyon testleri içermektedir ve hataların erken tespit edilmesini hedefler.

Test Öğeleri

Test süreci, platformun temel bileşenlerini kapsayacaktır:

Test edilecek başlıca modüller:

Ana Sayfa

Ana Sayfa Erişim

Online Admission

Admin Panel

Admin Login

Online Admission Approval

Teacher Panel

Teacher Login

Sınav Grupları ve Sonuç Yönetimi

Yoklama Yönetimi

İzin Yönetimi

Hızlı Linkler

Student Panel

Student Login

Profil Yönetimi

Online Sınavlar

Ödev Yönetimi

Katılım Bilgileri

Parent Panel

Parent Login

Öğrenci Profili Görüntüleme

Ücret Yönetimi

Sınav ve Katılım Bilgileri

Referans Dokümanlar

Platform kullanım kılavuzu

Teknik dokümantasyon ve API belgeleri

Güvenlik politikaları ve protokolleri

Test Stratejisi 

Keşif Testleri, belirli bir yazılım uygulamasının sistematik bir şekilde incelenmeden, daha çok deneyim ve sezgilerin kullanılarak, potansiyel hataları, eksiklikleri veya beklenmeyen davranışları keşfedecektir.

UI Testleri: Panellerdeki tüm bileşenlerin görsel doğruluğu ve etkileşim işlevselliği test edilecektir.

Fonksiyonel Testler: Tüm kullanıcı hikayelerine uygun olarak her özelliğin doğru çalıştığı kontrol edilecektir.

User Acceptance Test (UAT) : Son kullanıcılar tarafından gerçek kullanım koşullarında kullanıldığında nasıl performans göstereceğini test edecektir.

E2E Testleri: Kullanıcı senaryosu boyunca tüm bileşenlerin görsel doğruluğu ve etkileşim işlevselliği test edilecektir.

 Test Ortamı

Testler, gerçek kullanıcı koşullarını simüle eden ayrı bir QA ortamında gerçekleştirilecektir. Bu ortam,

gerçek veritabanı ve kullanıcı verilerinin anonimleştirilmiş kopyalarını içerecektir.

Platform URL: Home 

Test Ortamı: QA Envoirement

Tarayıcılar: Chrome (Son Sürüm), Firefox, Edge

Cihazlar: Windows, macOS, 

Test Araçları: Selenium, Cucumber

Test Verileri

1. Admin İşlemleri

Test Verileri:

Admin Giriş Bilgileri:

Kullanıcı Adı: ozlem.admin@wonderworldcollege.com

Şifre: o6*d@fko3PXL2

Online Başvuru Bilgileri:

Öğrenci Adı: Burak Demir

Kabul Numarası: 67890

Başvuru Durumu: Başvuru Bekliyor

Okul Kaydı Durumu: Henüz tamamlanmadı

Başvuru Onay Verildikten Sonra:

Öğrenci Adı: Burak Demir

Kabul Numarası: 67890

Okul Kaydı Durumu: Tamamlandı

2. Student İşlemleri

Test Verileri:

Öğrenci Giriş Bilgileri:

Kullanıcı Adı: pinar.student

Şifre: wonderworld123

Profil Bilgileri:

Roll Number: 23456

Adı: Ahmet Yılmaz

Sınıf: 10-A

Bölüm: Fen

Ödev Bilgileri:

Ödev Adı: Matematik Ödevi

Ödev Durumu: Tamamlandı

Online Sınav Sonuçları:

Sınav Adı: Matematik Quiz

Puan: 90

Devamsızlık Durumu:

Toplam Devamsızlık Gün Sayısı: 3

Devamsızlık Limiti: 5

Sınav Sonuçları:

Sınav Adı: Kimya Final

Puan: 75

Geçti/Kaldı: Geçti

İzin Başvurusu:

Başvuru Durumu: Onay Bekliyor

Başvuru Türü: Hastalık İzni

Öğretmen Değerlendirme:

Öğretmen Adı: Mehmet Çelik

Puan: 4/5

3. Öğretmen İşlemleri

Test Verileri:

Öğretmen Giriş Bilgileri:

Kullanıcı Adı: cem.bakir@wonderworldcollege.com

Şifre: o6*d@fko3PXL1

Günlük Yoklama Durumu:

Öğrenciler: Ahmet Yılmaz, Burak Demir, Canan Kılıç

Yoklama Durumu: Hepsi Katıldı

Sınav Grubu Bilgileri:

Grup Adı: 10-A Matematik

Grup Öğrencileri: Ahmet Yılmaz, Burak Demir

İzin Başvurusu:

Başvuru Durumu: Onaylandı

Başvuru Türü: Mazeret İzni

Mail Gönderme:

Alıcı: admin@wonderworld.com, superadmin@wonderworld.com

Başlık: Ödev Hakkında

Mesaj: Ödev teslim tarihi hakkında bilgi.

Ödev Ekleme:

Ödev Adı: Kimya Projesi

Teslim Tarihi: 20.01.2025

4. Parent İşlemleri

Test Verileri:

Veli Giriş Bilgileri:

Kullanıcı Adı: suleyman.parent

Şifre: wonderworld123

Öğrenci Bilgileri (Veli'nin Görebileceği):

Öğrenci Adı: Burak Demir

Kabul Numarası: 67890

Sınıf: 10-B

Bölüm: Sosyal Bilgiler

Cinsiyet: Erkek

Sınav Sonuçları:

Sınav Adı: Tarih Final

Puan: 88

Geçti/Kaldı: Geçti

Parent Kullanıcı Adı Değişikliği:

Eski Kullanıcı Adı: veli2

Test Senaryoları ve Test Durumla

7.1. Kullanıcı İşlemleri

Test Adımları:

Kullanıcı, ana sayfaya ulaşır ve online başvurulara tıklar.

Kullanıcı, başvuru formunu doldurur ve submit butonuna tıklar. 

Beklentiler:

Kullanıcının ana sayfaya ulaşabilmesi

Online başvuru formunun doğru şekilde görüntülenebilmesi ve submit edilebilmesi.

7.2. Admin İşlemleri

Test Adımları:

Admin, online başvuruları görür ve başvuru yapan öğrencilerin okul kaydını tamamlar.

Admin, öğrenci kaydını başarılı şekilde onaylar.

Beklentiler:

Admin paneli doğru şekilde çalışmalı.

Başvuru onayı ve öğrenci kaydı doğru şekilde gerçekleşmelidir.

7.3. Student İşlemleri

Test Adımları:

Öğrenci, giriş yaptıktan sonra profilinden roll number'ını görebilmeli.

Öğrenci, ödev kısmına erişmeli ve verilen ödevi tamamlayabilmeli.

Öğrenci, online sınav yapabilmeli.

Öğrenci, devamsızlık durumunu kontrol edebilmeli.

Öğrenci, sınav sonuçlarını inceleyebilmeli.

Öğrenci, izin başvurusu yapabilmeli.

Öğrenci, önceki öğretmenini değerlendirebilmelidir.

Öğrenci, çıkış yapabilmelidir.

Beklentiler:

Öğrencinin tüm işlemleri doğru şekilde çalışmalı (profil görüntüleme, ödev tamamlama, sınav sonuçları, devamsızlık takibi vb.).

Öğrenci başarıyla giriş yapmalı ve çıkış yapabilmelidir.

7.4. Öğretmen İşlemleri

Test Adımları:

Öğretmen, giriş yapar ve günün yoklamasını görür.

Öğretmen, sınav grupları oluşturabilir.

Öğretmen, izin başvurusu yapabilir ve mazeret izin talep edebilir.

Öğretmen, admin ve süper admin'e mail gönderebilir.

Öğretmen, ödev ekleyebilir.

Öğretmen, çıkış yapabilir.

Beklentiler:

Öğretmenin, yoklama ve sınav grubu işlemleri doğru şekilde çalışmalıdır.

Öğretmen, izin talebini başarılı şekilde gönderebilmelidir.

Öğretmen, mail gönderme ve ödev ekleme işlemlerini başarıyla gerçekleştirebilmelidir.

7.5. Parent İşlemleri

Test Adımları:

Parent (veli) giriş yapar.

Veli, öğrenci bilgilerini görebilmelidir (Öğrenci adı, kabul numarası, sınıf, bölüm, cinsiyet).

Veli, sınav sonuçlarını görebilmelidir.

Parent, çıkış yapabilmelidir.

Parent, kullanıcı adını değiştirebilir.

Beklentiler:

Parent (veli) başarılı bir şekilde giriş yapmalı ve öğrenci bilgilerini doğru şekilde görmelidir.

Sınav sonuçları doğru şekilde görüntülenmelidir.

Parent, çıkış yaptıktan sonra tekrar giriş yapabilmelidir.

Test Takvimi

Test süreci için bir takvim oluşturulmuştur. Bu takvim, testlerin başlangıç ve bitiş tarihlerini, önemli

kontrol noktalarını ve versiyon yayımlama tarihlerini içerir.

8.1 Test Hazırlığı

Süre: 1 Hafta

Başlangıç Tarihi: 03.01.2025

Bitiş Tarihi: 07.01.2025

Açıklama: Test ortamının kurulumu, test verilerinin hazırlanması ve test araçlarının konfigürasyonu.

8.2 UI Otomasyon Testler

Süre: 1 Hafta

Başlangıç Tarihi: 10.01.2025

Bitiş Tarihi: 17.01.2025

Açıklama: Kullanıcı ara yüzü, admin panel, student panel, teacher panel ve parent panel sayfalarının test edilmesi.

 

 

