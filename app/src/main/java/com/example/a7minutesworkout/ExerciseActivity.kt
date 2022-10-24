package com.example.a7minutesworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a7minutesworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {

    private var viewBinding: ActivityExerciseBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(viewBinding?.root)

        setSupportActionBar(viewBinding?.toolbar)

        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        viewBinding?.toolbar?.setNavigationOnClickListener {
            onBackPressed()
        }


    }
}