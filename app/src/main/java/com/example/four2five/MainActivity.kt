package com.example.four2five

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.four2five.data.CheckData

import com.example.four2five.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_fragment_exam.*
import kotlinx.android.synthetic.main.activity_main.*

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

        binding.fragButton.setOnClickListener{
            if (checkData.checktwo == 0) {
                binding.view.visibility=View.VISIBLE
                supportFragmentManager.beginTransaction()
                    .replace(R.id.view, FragmentExam())
                    .commit()
                checkData.checktwo = 1
            } else {
                binding.view.visibility=View.INVISIBLE
                checkData.checktwo = 0
            }
        }


    }

    fun showDatabinding(view: View){
        val intent = Intent(this, RecyclerViewModel::class.java)
        startActivity(intent)
    }

}