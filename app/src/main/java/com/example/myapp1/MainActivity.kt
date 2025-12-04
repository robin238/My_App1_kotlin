package com.example.myapp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val angkaBulatnull: Int? = null;
    var angkaBulat: Int = 10;
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
        angkaBulat++
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

        val textView: TextView = findViewById(R.id.text_view)
        val btnHitung: Button = findViewById(R.id.btn_hitung)

        btnHitung.setOnClickListener({
            hitung()
            textView.text= angkaBulat.toString()
        })
    }
}