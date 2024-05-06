package com.example.imad5111a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.*

//Setting up status variables
var Hunger = 15
var Clean = 15
var Happy = 15



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Setting up button and textview values
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val txtHunger = findViewById<TextView>(R.id.txtHungerVal)
        val txtClean = findViewById<TextView>(R.id.txtCleanVal)
        val txtHappy = findViewById<TextView>(R.id.txtHappyVal)
//Setting up Image variables
        val imgDog = findViewById<ImageView>(R.id.imgDog)
        val imgDogClean = R.drawable.imad5111a2_dogcleaned
        val imgDogEat = R.drawable.imad5111a2_dogeating
        val imgDogPet = R.drawable.imad5111a2_dogpet
        val imgDogReg = R.drawable.imad5111a2_dog
//Starting Values
        txtHunger.setText(Hunger.toString())
        txtClean.setText(Clean.toString())
        txtHappy.setText(Happy.toString())

        imgDog.setOnClickListener{
            imgDog.setImageResource(imgDogReg)
        }
        btnFeed.setOnClickListener{
            Hunger -= 10
            txtHunger.setText(Hunger.toString())
            imgDog.setImageResource(imgDogEat)
        }
        btnClean.setOnClickListener{
            Clean -= 10
            txtClean.setText(Clean.toString())
            imgDog.setImageResource(imgDogClean)
        }
        btnPlay.setOnClickListener{
            Happy += 10
            txtHappy.setText(Happy.toString())
            imgDog.setImageResource(imgDogPet)
        }
        var job: Job? = null
        fun startIncrement() {
            job = CoroutineScope(Dispatchers.Main).launch {
                while (isActive) {
                    if(Hunger < 0 || Clean > 100|| Happy > 100){
                        onPause()
                    }
                    // Changing Status`s
                    Hunger += 2
                    Clean += 2
                    Happy -= 2
                    txtHunger.setText(Hunger.toString())
                    txtClean.setText(Clean.toString())
                    txtHappy.setText(Happy.toString())
                    // Timer Delay in ms
                    delay(1000)

                }
            }
        }
        fun onResume() {
            super.onResume()
            startIncrement()
        }

        fun onPause() {
            super.onPause()
            job?.cancel()
        }

        fun onDestroy() {
            super.onDestroy()
            job?.cancel()
        }
        onResume()
    }

}