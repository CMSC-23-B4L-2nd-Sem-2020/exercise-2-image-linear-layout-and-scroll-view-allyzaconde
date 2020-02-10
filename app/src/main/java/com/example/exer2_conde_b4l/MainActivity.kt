package com.example.exer2_conde_b4l

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun randomizeButton(view: View) {
        val randomInt = (1..10).random()

        val drawableResource = when (randomInt){
            1 -> R.drawable.hercules
            2 -> R.drawable.kida
            3 -> R.drawable.kuzco
            4 -> R.drawable.marlin
            5 -> R.drawable.mickeymouse
            6 -> R.drawable.mowgli
            7 -> R.drawable.quasimodo
            8 -> R.drawable.simba
            9 -> R.drawable.sinbad
            else -> R.drawable.tinkerbell
        }

        val resultImage: ImageView = findViewById(R.id.disney_image)
        resultImage.setImageResource(drawableResource)

        val resultText: TextView = findViewById(R.id.disney_bio_text)
        when (randomInt){
            1 -> resultText.setText(R.string.hercules)
            2 -> resultText.setText(R.string.kida)
            3 -> resultText.setText(R.string.kuzco)
            4 -> resultText.setText(R.string.marlin)
            5 -> resultText.setText(R.string.mickeymouse)
            6 -> resultText.setText(R.string.mowgli)
            7 -> resultText.setText(R.string.quasimodo)
            8 -> resultText.setText(R.string.simba)
            9 -> resultText.setText(R.string.sinbad)
            else -> resultText.setText(R.string.tinkerbell)
        }

        val resultTextTitle: TextView = findViewById(R.id.disney_title)
        when (randomInt){
            1 -> resultTextTitle.setText(R.string.hercules_name)
            2 -> resultTextTitle.setText(R.string.kida_name)
            3 -> resultTextTitle.setText(R.string.kuzco_name)
            4 -> resultTextTitle.setText(R.string.marlin_name)
            5 -> resultTextTitle.setText(R.string.mickeymouse_name)
            6 -> resultTextTitle.setText(R.string.mowgli_name)
            7 -> resultTextTitle.setText(R.string.quasimodo_name)
            8 -> resultTextTitle.setText(R.string.simba_name)
            9 -> resultTextTitle.setText(R.string.sinbad_name)
            else -> resultTextTitle.setText(R.string.tinkerbell_name)
        }
    }

    fun reset(view: View) {
        val resultImage: ImageView = findViewById(R.id.disney_image)
        resultImage.setImageResource(R.drawable.logo)

        val resultText: TextView = findViewById(R.id.disney_bio_text)
        resultText.setText(R.string.main)

        val resultTextTitle: TextView = findViewById(R.id.disney_title)
        resultTextTitle.setText((R.string.disney_title))
    }
}
