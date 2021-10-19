package com.sanji.youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sanji.youtube.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var buildingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(buildingClass.root)

        buildingClass.resultbutton.setOnClickListener {
            when (buildingClass.enterSubs.text.toString().toInt()){
                in 0..1000 -> {
                    buildingClass.result.text = "Beginner!"
                    buildingClass.justText.visibility = View.VISIBLE
                    buildingClass.result.visibility = View.VISIBLE
                }
                in 1000..10000 -> {
                    buildingClass.result.text = "Perspective!"
                    buildingClass.justText.visibility = View.VISIBLE
                    buildingClass.result.visibility = View.VISIBLE
                }
                in 10000..100000 -> {
                    buildingClass.result.text = "Almost a star!"
                    buildingClass.justText.visibility = View.VISIBLE
                    buildingClass.result.visibility = View.VISIBLE
                }
                in 100000..1000000 -> {
                    buildingClass.result.text = "STAR!"
                    buildingClass.justText.visibility = View.VISIBLE
                    buildingClass.result.visibility = View.VISIBLE
                }
                else ->{
                    buildingClass.result.text = "SUPERSTAR!!!"
                    buildingClass.justText.visibility = View.VISIBLE
                    buildingClass.result.visibility = View.VISIBLE
                }
            }
        }
        buildingClass.restartbutton.setOnClickListener {
            buildingClass.justText.visibility = View.INVISIBLE
            buildingClass.result.visibility = View.INVISIBLE
            buildingClass.enterSubs.text = null
        }
    }
}