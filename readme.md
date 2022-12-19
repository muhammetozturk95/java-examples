# Java Examples

## Calculator

This program is a calculator application coded in java.

### Example-1
Input first number: 5

Input second number: 6

Select the transaction that you want:

1-Addition

2-Subtraction

3-Multiplication

4-Division

Your choice: 4

RESULT: 0.83

### Example-2
Input first number: 10

Input second number: 0

Select the transaction that you want:

1-Addition

2-Subtraction

3-Multiplication

4-Division

Your choice: 4

A number cannot be divided by zero!

## Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programdır.

### Meyveler ve KG Fiyatları

- Armut : 2,14 TL
- Elma : 3,67 TL
- Domates : 1,11 TL
- Muz: 0,95 TL
- Patlıcan : 5,00 TL

### Çıktı;

Armut Kaç Kilo ? : 3

Elma Kaç Kilo ? : 4

Domates Kaç Kilo ? : 5

Muz Kaç Kilo ? : 6

Patlican Kaç Kilo ? : 7

Toplam Tutar: 67.35 TL

## Vucut Kitle Indeksi

Java ile kullanıcıdan boy ve kilo değerlerini alıp Vücut Kitle İndeksini hesaplayan programdır.

Formül
Kilo (kg) / Boy(m) * Boy(m)

### Örnek

**Input:**

Kilonuzu kg cinsinden giriniz: 75

Boyunuzu santimetre cinsinden giriniz: 179

**Output:**

Boyunuz: 179 cm

Kilonuz: 75 kg

Vücut Kitle İndeksiniz: 23.41

## Dairenin Diliminin Alanını Hesaplayan Program

Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programdır.

𝜋 sayısı 3.14 olarak kabul edilecektir.

Formül : (𝜋 * (r*r) * 𝛼) / 360

### Örnek

**Input:** Yaricapi cm cinsinden giriniz: 5

**Input:** Merkez acisini derece cinsinden giriniz: 35

**Output:** Yaricapi 5 cm, merkez acisi 35 derece olan daire diliminin alani: 7.63 cm2'dir.

## Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

- Taksimetre KM başına 2.20 TL tutmaktadır.
- Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
- Taksimetre açılış ücreti 10 TL'dir.

### Örnek

Gidilen mesafeyi giriniz: 1

Gidilen mesafe: 1.0 km

Ödenecek tutar: 20.0 TL

### Örnek

Gidilen mesafeyi giriniz: 30

Gidilen mesafe: 30.0 km

Ödenecek tutar: 76.0 TL

## Üçgenin alanını hesaplayan program
Üç kenar uzunluğu kullanıcıdan alınan üçgenin alanını hesaplayan programdır.

Kullanıcının girdiği değerler üçgen oluşturma kurallarını sağlıyorsa program çalışır. Aksi durumda hata verir.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

### Örnek

birinci kenari giriniz: 1

ikinci kenari giriniz: 2

ucuncu kenari giriniz: 3

Koşul sağlanmadığından aşağıdaki hatayı alırız:

*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Double.doubleValue()"
at UcgeninAlani.main(UcgeninAlani.java:24)*

### Örnek

birinci kenari giriniz: 3

ikinci kenari giriniz: 4

ucuncu kenari giriniz: 5

ucgenin cevresi: 12.0

ucgenin alani: 6.0

## KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını, KDV tutarını ve toplam tutarı hesaplayıp ekrana bastıran programdır.

Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak hesaplar.

### Örnek1: Girilen sayının 0'dan büyük, 1000'den küçük olma durumu

Fiyati giriniz: 900

KDV'siz fiyat: 900.0 TL

KDV orani: 0.18

KDV tutari: 162.0

Toplam tutar: 1062.0 TL


### Örnek2: Girilen sayının 1000'den büyük olma durumu

Fiyati giriniz: 2000

KDV'siz fiyat: 2000.0 TL

KDV orani: 0.08

KDV tutari: 160.0

Toplam tutar: 2160.0 TL

## Kullanıcı Adı ve Şifre Doğruluğunu Denetleyen Program

Bu program girilen kullanıcı adı ve şifre doğruluğuna göre giriş yapılıp yapılmadığı uyarısını verir. Eğer şifre yanlış girildiyse isteğe bağlı olarak şifre sıfırlaması yapar.

### Örnek1


Input your username: java

Input your password: script

You are logged in!

### Örnek2

Input your username: java

Input your password: 123

Your password is wrong. Do you want to reset your password? yes/no

**yes**

Create new password

**best**

Your password has been changed successfully!

### Örnek3

Input your username: java

Input your password: 456

Your password is wrong. Do you want to reset your password? yes/no

**yes**

Create new password

**script**

Your password cannot be the same old password!

### Örnek4

Input your username: ruby

Input your password: on rails

Wrong username or password!