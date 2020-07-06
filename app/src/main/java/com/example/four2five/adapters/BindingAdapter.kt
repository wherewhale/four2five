package com.example.four2five.adapters

import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter


@BindingAdapter("imageDrawable")
fun bindImageFromRes(view: ImageView, drawable: Drawable?) {
    view.setImageDrawable(drawable)
}