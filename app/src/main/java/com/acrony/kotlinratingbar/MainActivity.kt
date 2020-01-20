package com.acrony.kotlinratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ratingbars=findViewById<RatingBar>(R.id.ratingBar)
        var bRating=findViewById<Button>(R.id.btnRating)

        if(ratingbars!=null){

            bRating?.setOnClickListener {

                val message=ratingbars.rating.toString()

                Toast.makeText(applicationContext,"Rating is:"+message,Toast.LENGTH_LONG).show()
            }
        }

    }
}
