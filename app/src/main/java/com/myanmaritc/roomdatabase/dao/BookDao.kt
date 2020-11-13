package com.myanmaritc.roomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.myanmaritc.roomdatabase.model.Book

@Dao
interface BookDao {

    @Insert
    fun saveBooks(book: Book)

    @Query(value = "SELECT * FROM Book")
    fun getAllBooks(): List<Book>
}