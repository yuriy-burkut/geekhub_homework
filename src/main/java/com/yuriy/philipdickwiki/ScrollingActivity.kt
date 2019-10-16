package com.yuriy.philipdickwiki

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_scrolling.*

internal lateinit var scrollingText: TextView
internal lateinit var toolbarImage: ImageView

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)

        scrollingText = findViewById(R.id.text)
        toolbarImage = findViewById(R.id.toolbar_image)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

            when (item.itemId) {
            R.id.nav_home -> openHome()
            R.id.nav_biography -> openBiography()
            R.id.nav_books -> openBooks()
            R.id.nav_movies -> openMovies()
            else -> super.onOptionsItemSelected(item)
        }

        return true
    }

    private fun openHome() : Boolean {
        title = "Philip Kindred Dick"
        scrollingText.text = getText(R.string.basic_info);
        toolbar_image.setImageResource(R.drawable.toolbar_image)
        return true
    }

    private fun openBiography() : Boolean {
        title = "Biography"
        scrollingText.text = getText(R.string.biography);
        toolbar_image.setImageResource(R.drawable.toolbar_image_life)
        return true
    }

    private fun openBooks() : Boolean {
        title = "Books"
        scrollingText.text = getText(R.string.books);
        toolbar_image.setImageResource(R.drawable.toolbar_image_books)
        return true
    }

    private fun openMovies() : Boolean {
        title = "Movies"
        scrollingText.text = getText(R.string.movies);
        toolbar_image.setImageResource(R.drawable.toolbar_image_movies)
        return true
    }
}
