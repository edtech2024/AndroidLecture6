package com.example.myapplicationsix.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.myapplicationsix.domain.Item

@Dao
interface ItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(item: Item)

    @Update
    fun update(item: Item)

    @Query("SELECT * FROM items")
    fun getAll(): LiveData<List<Item>>

}