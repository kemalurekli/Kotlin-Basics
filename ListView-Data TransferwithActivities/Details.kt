package com.kemalurekli.kotlinlistview


import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kemalurekli.kotlinlistview.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val carBrand = intent.getStringExtra("name")
        binding.textView.text = carBrand


        val brandListIds = intent.getIntExtra("image",0)
        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,brandListIds)
        binding.imageView.setImageBitmap(selectedBitmap)


    }
}