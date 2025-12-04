package com.example.myapp1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val angkaBulatnull: Int? = null;
    val angkaBulat: Int = 10;
    val angkaDesimal: Double = 14.3;
    val angkaPanjang: Long = 1401231312;

    val karakter: Char = 'A';
    var kata: String = "Ini adalah contoh text panjang";

    var benar: Boolean = true;
    val salah: Boolean = false;

    val angkaArray: Array<Int> = arrayOf(1, 2, 3, 4, 5) ;
    val stringArray: Array<String> = arrayOf("robin" , "ujianto") ;
    val booleanArray: Array<Boolean> = arrayOf(true , false) ;

    fun hitung(){

    }

    fun hitung(angka: Int?, kata: String){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if(angkaBulat == 4 && angkaDesimal > 13){
            benar = true
            kata = "perubahan text"
        }else{
            benar = false
        }
    }
}