package kg.tutorialapp.mycolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    lateinit var red : Button
    lateinit var yellow : Button
    lateinit var green : Button
    lateinit var textTv : TextView
    private var lt:ConstraintLayout?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        red = findViewById(R.id.btnred)
        green = findViewById(R.id.btngreen)
        yellow = findViewById(R.id.btnyellow)
        textTv = findViewById(R.id.tvText)
        lt = findViewById(R.id.color)

        red.setOnClickListener {
            textTv.text = "Красный"
            lt?.setBackgroundColor(Color.RED)
        }
        green.setOnClickListener {
            textTv.text = "Зеленый"
            lt?.setBackgroundColor(Color.GREEN)
        }
        yellow.setOnClickListener {
            textTv.text = "Жёлтый"
            lt?.setBackgroundColor(Color.YELLOW)
        }

    }
}