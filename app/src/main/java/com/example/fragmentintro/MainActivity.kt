package com.example.fragmentintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun addPinkFragment(view: View) {
        val pinkFragment = PinkFragment()// Skapar fragment av klassen fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, pinkFragment, "pinkFragment")
        transaction.commit()

    }

    fun removePinkFragment(view: View) {
        val pinkFragment = supportFragmentManager.findFragmentByTag("pinkFragment")

        if (pinkFragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(pinkFragment)
            transaction.commit()
        } else {
            //Skapar en liten ruta på skärm som visar upp den medlander
            Toast.makeText(this, "PinkFragment not found", Toast.LENGTH_SHORT).show()
        }
    }

    fun addYellowFragment(view: View) {
        //val yellowFragment= YellowFragment()
        val yellowFragment =
            YellowFragment.newInstance("Hej", "Rai") // Skapar fragment av klassen fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, yellowFragment, "yellowFragment")
        transaction.commit()

    }

    fun removeYellowFragment(view: View) {
        val fragment = supportFragmentManager.findFragmentByTag("yellowFragment")

        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(fragment)
            transaction.commit()
        } else {
            //Skapar en liten ruta på skärm som visar upp den medlander
            Toast.makeText(this, "yellowFragment not found", Toast.LENGTH_SHORT).show()
        }

    }

    fun replaceWithPinkFragment(view: View) {
        val fragment = PinkFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment, "pinkFragment")
        transaction.commit()
    }

    fun changeText(view: View) {

       // val pinkView= findViewById<TextView>(R.id.pinkTextView)
        //pinkView.text= "Rai"

        val fragment = supportFragmentManager.findFragmentByTag("pinkFragment") as PinkFragment?

        fragment?.setText("Rai")

        //fragment?.setImage(image)

    }

}