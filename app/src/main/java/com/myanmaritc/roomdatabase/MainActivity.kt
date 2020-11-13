package com.myanmaritc.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.myanmaritc.roomdatabase.database.BookDatabase
import com.myanmaritc.roomdatabase.model.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db =
            Room.databaseBuilder(applicationContext, BookDatabase::class.java, "BookDB").build()

        Thread {
            var book = Book(1, "Kotlin Basic")

            db.bookDao().saveBooks(book)

            db.bookDao().getAllBooks().forEach {
                Log.d("Database>>>>>", "id:${it.bookID}")
                Log.d("Database>>>>", "name:${it.bookName}")
            }
        }.start()
    }
}