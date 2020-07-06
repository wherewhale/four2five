package com.example.four2five.data

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.Toast

class SampleItem(val image: Drawable, val title: String) {
    fun onClickListener(view: View) {
        Toast.makeText(view.context, "Clicked: $title", Toast.LENGTH_SHORT).show()
    }
}