package com.example.restapi_dipti_ict_amad_l4_04_23


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restapi_dipti_ict_amad_l4_04_23.Adapter_DIPTI_ICT_AMAD_L4_04_23.ProductAdapter_DIPTI_ICT_AMAD_L4_04_23
import com.example.restapi_dipti_ict_amad_l4_04_23.viewModel_DIPTI_ICT_AMAD_L4_04_23.ProductViewModel_DIPTI_ICT_AMAD_L4_04_23

import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity_DIPTI_ICT_AMAD_L4_04_23 : AppCompatActivity() {

    private lateinit var productViewModel: ProductViewModel_DIPTI_ICT_AMAD_L4_04_23
    private lateinit var productAdapter: ProductAdapter_DIPTI_ICT_AMAD_L4_04_23

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_dipti_ict_amad_l40423)

        productViewModel = ViewModelProvider(this).get(ProductViewModel_DIPTI_ICT_AMAD_L4_04_23::class.java)
        productAdapter = ProductAdapter_DIPTI_ICT_AMAD_L4_04_23(emptyList())

        val refreshBtn: FloatingActionButton = findViewById(R.id.refreshBtn)

        refreshBtn.setOnClickListener{
            startActivity(Intent(this@ProductActivity_DIPTI_ICT_AMAD_L4_04_23,ProductActivity_DIPTI_ICT_AMAD_L4_04_23::class.java))
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.productRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productViewModel.products.observe(this, Observer{ product->
            productAdapter = ProductAdapter_DIPTI_ICT_AMAD_L4_04_23(product)
            recyclerView.adapter = productAdapter
        })
    }
}