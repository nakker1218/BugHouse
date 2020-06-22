package app.nickname.myoji.bughouse.launcher

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.nickname.myoji.bughouse.*
import kotlinx.android.synthetic.main.activity_launcher.*

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        countActivityCell.setOnClickListener {
            val intent = Intent(this, CountActivity::class.java)
            startActivity(intent)
        }

        saveActivityCell.setOnClickListener {
            val intent = Intent(this, SaveActivity::class.java)
            startActivity(intent)
        }

        loadActivityCell.setOnClickListener {
            val intent = Intent(this, LoadActivity::class.java)
            startActivity(intent)
        }

        imageViewActivityCell.setOnClickListener {
            val intent = Intent(this, ImageViewActivity::class.java)
            startActivity(intent)
        }

        listActivityCell.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}
