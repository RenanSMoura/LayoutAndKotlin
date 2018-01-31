package com.example.renan.layoutandkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.media_16_9_and_support_text.*
import kotlinx.android.synthetic.main.media_16_9_and_support_text.view.*

/**
 * Created by renan on 31/01/18.
 */
class MediaSupportText : AppCompatActivity() {

    val imgPath = "https://i1.wp.com/www.kenlyonsphotography.com.au/wp-content/uploads/2014/10/140409-London-England-195928-1024px.jpg?ssl=1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.media_16_9_and_support_text)
        var image = findViewById<ImageView>(R.id.media_image)
        Picasso.with(this).setIndicatorsEnabled(true)
        Picasso.with(this).load(imgPath).into(image)

    }
}