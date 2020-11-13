package com.myanmaritc.roomdatabase.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Book(
    @PrimaryKey
    @ColumnInfo(name = "book_id")
    var bookID: Int,

    @ColumnInfo(name = "book_name")
    var bookName: String
)