package com.example.four2five

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.four2five.adapters.RecyclerAdapter
import com.example.four2five.data.SampleItem
import com.example.four2five.databinding.ActivityMainBinding
import com.example.four2five.R.layout
import com.example.four2five.databinding.ActivityRecyclerViewModelBinding

class RecyclerViewModel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityRecyclerViewModelBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_recycler_view_model
        )

        val list = ArrayList<SampleItem>(listOf(
            SampleItem(getDrawable(R.drawable.image01)!!, getString(R.string.title01)),
            SampleItem(getDrawable(R.drawable.image02)!!, getString(R.string.title02)),
            SampleItem(getDrawable(R.drawable.image03)!!, getString(R.string.title03)),
            SampleItem(getDrawable(R.drawable.image04)!!, getString(R.string.title04)),
            SampleItem(getDrawable(R.drawable.image05)!!, getString(R.string.title05)),
            SampleItem(getDrawable(R.drawable.image06)!!, getString(R.string.title06))))



        val adapter = RecyclerAdapter(list)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}