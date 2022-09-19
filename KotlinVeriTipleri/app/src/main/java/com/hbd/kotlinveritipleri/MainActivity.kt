package com.hbd.kotlinveritipleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Değişken ve Sabitler

        /*
        var : Değişen değerler için
        val : Sabit, değitirilmeyen değerler için
         */

        /*
        var sayi1 : Int = 6
        var sayi2 : Int = 5
        var sonuc1 : Int

        var adi:String="Hasan Basri"
        val soyAdi:String="Darga"

        sonuc1 = sayi1 + sayi2
        Toast.makeText(applicationContext,"$sonuc1 + $adi + $soyAdi",Toast.LENGTH_LONG).show() // sonucun emulatorde gözükmesini sağladık
        */

        // integer veri tipi
        /*
        var sayiA : Int = 23
        var sayiB : Int = 5
        var sonuc2 : Int

        sonuc2 = sayiA / sayiB

        Toast.makeText(applicationContext,"$sonuc2",Toast.LENGTH_LONG).show()
         */

        // eğer veri tipini : sonra yazmazsak, değerimiz tam sayı ise Int , kesirli sayı ise Double olarak algılar
        // Long veri tipi için sayının sonuna L yazmamız gerekir
        /*
        var sayiC = 25
        var sayiD = 200000000L
        var sayiE : Double = 2.5
        var sayiG = 3.5

        var sonuc3 : Long
        var sonuc4 : Double

        sonuc3 = sayiC + sayiD
        sonuc4 = sayiE + sayiG

        Toast.makeText(applicationContext,"$sonuc3",Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext,"$sonuc4",Toast.LENGTH_SHORT).show()
         */
    }
}