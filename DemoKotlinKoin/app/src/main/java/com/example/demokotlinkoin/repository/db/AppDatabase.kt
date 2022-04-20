package com.example.demokotlinkoin.repository.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.demokotlinkoin.repository.dao.UserDao
import com.example.demokotlinkoin.repository.entity.GithubUser

@Database(entities = [GithubUser::class], version = 1, exportSchema = false)
abstract class AppDatabase:RoomDatabase() {
 abstract  val userDao: UserDao
}