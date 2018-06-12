package com.big0.chung.lesson02_github_repo_search

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // COMPLETED (8) Override onCreateOptionsMenu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // COMPLETED (9) Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
        menuInflater.inflate(R.menu.main, menu)
        // COMPLETED (10) Return true to display your menu
        return true
    }

    // COMPLETED (11) Override onOptionsItemSelected
    // COMPLETED (12) Within onOptionsItemSelected, get the ID of the item that was selected
    // COMPLETED (13) If the item's ID is R.id.action_search, show a Toast and return true to tell Android that you've handled this menu click
    // COMPLETED (14) Don't forgot to call .show() on your Toast
    // COMPLETED (15) If you do NOT handle the menu click, return super.onOptionsItemSelected to let Android handle the menu click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_search) {
            Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
