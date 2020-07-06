package com.example.four2five

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.four2five.databinding.ActivityMainBinding

data class CheckData(
    var checkone: Int,
    var checktwo: Int
)


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var checkData = CheckData(0, 0)
        binding.vbinding.setOnClickListener {
            if (checkData.checkone == 0) {
                binding.change.text = "ViewBinding"
                checkData.checkone = 1
            } else {
                binding.change.text = "What U Want?"
                checkData.checkone = 0
            }

        }


    }

    fun showDatabinding(view: View){
        val intent = Intent(this, RecyclerViewModel::class.java)
        startActivity(intent)
    }

}