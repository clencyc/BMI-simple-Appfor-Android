package com.example.simple_bmicalc_clency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var txt_display_answer:TextView
    private lateinit var edt_height:EditText
    private lateinit var edt_weight:EditText
    private lateinit var btn_calc:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_display_answer = findViewById(R.id.textView3)
        edt_height = findViewById(R.id.edtheight)
        edt_weight = findViewById(R.id.edtweight)
        btn_calc = findViewById(R.id.btncalc)

        btn_calc.setOnClickListener {
            var height = edt_height.text.toString().trim()
            var weight = edt_weight.text.toString().trim()

            if (height.isEmpty() || weight.isEmpty()) {
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show()


            }
            else{
                var heightinmetre = height.toFloat() / 100
                var BMI = weight.toDouble() / (heightinmetre.toDouble() * heightinmetre.toDouble())
                txt_display_answer.text = BMI.toString()

                //Toast.makeText(this, "Trying to calculate our BMI", Toast.LENGTH_SHORT).show()
            }




        }
    }
}