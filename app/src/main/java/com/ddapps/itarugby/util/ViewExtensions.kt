package com.ddapps.itarugby.util

import android.app.Activity
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.ddapps.itarugby.R

//fun TextView.toTypeface(fontName: String) {
//    val customTypeface = Typeface.createFromAsset(this.context.resources.assets, "fonts/$fontName.ttf")
//    typeface = customTypeface
//}

fun ImageView.load(activity: Activity, url: String?, postponeTransition: Boolean = false) {
    val imageView = this

    var requestOptions = Glide.with(imageView).load(url)
        .apply(
            RequestOptions()
                .placeholder(ColorDrawable(ContextCompat.getColor(context, R.color.green_800)))
                .centerCrop()
        )
        .transition(DrawableTransitionOptions.withCrossFade(300))

    if (postponeTransition) {
        requestOptions = requestOptions.listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                ActivityCompat.startPostponedEnterTransition(activity)
                return true
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                ActivityCompat.startPostponedEnterTransition(activity)
                imageView.setImageDrawable(resource)
                return true
            }
        })
    }

    requestOptions.into(this)
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.INVISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

//
//fun ViewGroup.inflate(@LayoutRes layoutResId: Int, attachToRoot: Boolean = false): View {
//    return LayoutInflater.from(this.context).inflate(layoutResId, this, attachToRoot)
//}
//
