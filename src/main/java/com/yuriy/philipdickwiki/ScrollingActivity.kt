package com.yuriy.philipdickwiki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_scrolling.*
import kotlinx.android.synthetic.main.content_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.nav_home -> openHome()
            R.id.nav_biography -> openBiography()
            R.id.nav_books -> openBooks()
            R.id.nav_movies -> openMovies()
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openHome(): Boolean {
        title = "Philip Kindred Dick"
        scrolling_text.text = getText(R.string.basic_info)
        toolbar_image.setImageResource(R.drawable.toolbar_image)
        return true
    }

    private fun openBiography(): Boolean {
        title = "Biography"
        scrolling_text.text = getText(R.string.biography)
        toolbar_image.setImageResource(R.drawable.toolbar_image_life)
        return true
    }

    private fun openBooks(): Boolean {
        title = "Books"
        scrolling_text.text = getText(R.string.books)
        toolbar_image.setImageResource(R.drawable.toolbar_image_books)
        return true
    }

    private fun openMovies(): Boolean {
        title = "Movies"
        scrolling_text.text = getText(R.string.movies)
        toolbar_image.setImageResource(R.drawable.toolbar_image_movies)
        return true
    }
}
