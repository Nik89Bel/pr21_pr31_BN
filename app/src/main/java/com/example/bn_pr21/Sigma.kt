package com.example.bn_pr21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Sigma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigma)
        val currentFr=supportFragmentManager.findFragmentById(R.id.fragment_container)
        if(currentFr==null){
            val fragment=Crimefragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container,fragment)
                .commit()
        }
    }

    fun hh(view: View) {
        Snackbar.make(view,"Кнопка первая", Snackbar.LENGTH_LONG).show()
    }

    fun cl(view: View) {
        var bb: Button
        val currentDate = Date()

        val dateFormat: DateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
        val dateText: String = dateFormat.format(currentDate)

        /*  val timeFormat: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
          val timeText: String = timeFormat.format(currentDate)*/
        bb=findViewById(R.id.crime_date)
        bb.setText(dateText);

    }
}