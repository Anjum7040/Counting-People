package learning.android.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybuttonview =findViewById<Button>(R.id.mybutton)
        val mytextview=findViewById<TextView>(R.id.textView)
        var countclick=0
        mybuttonview.setOnClickListener {
           countclick=countclick+1
            mytextview.text= countclick.toString()
            Toast.makeText(this,"Hi Kotlin",Toast.LENGTH_LONG).show()
        }
    }
}