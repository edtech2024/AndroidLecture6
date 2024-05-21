package com.example.myapplicationsix.data

import androidx.lifecycle.LiveData
import com.example.myapplicationsix.domain.Item

class ItemRepository(val itemDao: ItemDao) {

    fun insertItem(item: Item) {
        itemDao.insert(item)
    }

    fun updateItem(item: Item) {
        itemDao.update(item)
    }

    fun callMethod(): LiveData<List<Item>> {
        return itemDao.getAll()
    }

}