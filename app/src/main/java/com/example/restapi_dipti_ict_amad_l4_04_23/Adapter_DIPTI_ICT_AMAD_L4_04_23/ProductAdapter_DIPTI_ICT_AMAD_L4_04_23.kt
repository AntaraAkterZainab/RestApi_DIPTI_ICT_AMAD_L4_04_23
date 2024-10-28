package com.example.restapi_dipti_ict_amad_l4_04_23.Adapter_DIPTI_ICT_AMAD_L4_04_23


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.restapi_dipti_ict_amad_l4_04_23.Product_DIPTI_ICT_AMAD_L4_04_23
import com.example.restapi_dipti_ict_amad_l4_04_23.R

class ProductAdapter_DIPTI_ICT_AMAD_L4_04_23(private val products:List<Product_DIPTI_ICT_AMAD_L4_04_23>):RecyclerView.Adapter<ProductAdapter_DIPTI_ICT_AMAD_L4_04_23.ProductViewHolder>() {
    inner class ProductViewHolder(iteView: View):RecyclerView.ViewHolder(iteView) {

        val productImg = iteView.findViewById<ImageView>(R.id.productImage)
        val productName = iteView.findViewById<TextView>(R.id.nameTxt)
        val productPrice = iteView.findViewById<TextView>(R.id.priceTxt)

        fun bind(product: Product_DIPTI_ICT_AMAD_L4_04_23){
            productName.text = product.title
            productPrice.text = "$${product.price}"
            Glide.with(itemView).load(product.images[0])
                .into(productImg)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_dipti_ict_amad_l40423,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }
}