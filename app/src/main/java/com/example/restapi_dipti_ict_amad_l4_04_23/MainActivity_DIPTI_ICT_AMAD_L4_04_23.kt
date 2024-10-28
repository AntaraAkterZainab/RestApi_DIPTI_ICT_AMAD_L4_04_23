package com.example.restapi_dipti_ict_amad_l4_04_23

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_DIPTI_ICT_AMAD_L4_04_23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main__dipti_ict_amad_l40423)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@MainActivity_DIPTI_ICT_AMAD_L4_04_23,ProductActivity_DIPTI_ICT_AMAD_L4_04_23::class.java))
            finish()
        },3000)
    }
}