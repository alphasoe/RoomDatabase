package com.myanmaritc.roomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.myanmaritc.roomdatabase.dao.BookDao
import com.myanmaritc.roomdatabase.model.Book

@Database(entities = [Book::class], version = 1)
abstract class BookDatabase : RoomDatabase() {

    abstract fun bookDao():BookDao
}