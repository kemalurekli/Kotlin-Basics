package com.kemalurekli.kotlinlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.kemalurekli.kotlinlistview.databinding.ActivityMainBinding
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var carBrand = ArrayList<String>()
        carBrand.add("Mercedes")
        carBrand.add("BMW")
        carBrand.add("Audi")
        carBrand.add("Volkswagen")


        val mercedesId = R.drawable.mercedes
        val bmwId = R.drawable.bmw
        val audiId = R.drawable.audi
        val vwId = R.drawable.vw

        val brandListId = ArrayList<Int>()
        brandListId.add(mercedesId)
        brandListId.add(bmwId)
        brandListId.add(audiId)
        brandListId.add(vwId)


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,carBrand)
        //Custom list view
        //val adapter = ArrayAdapter(this,R.layout.custom_list_row,R.id.textViewX,carBrand)
        binding.listView.adapter = adapter
        
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext,Details::class.java)
            intent.putExtra("name",carBrand[position])
            intent.putExtra("image",brandListId[position])
            startActivity(intent)
        }



    }
    }
