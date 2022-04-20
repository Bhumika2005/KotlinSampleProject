package com.example.demokotlinkoin.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.demokotlinkoin.repository.domain.RetrofitClient
import com.example.demokotlinkoin.repository.domain.UserApi
import com.example.demokotlinkoin.repository.entity.ToDo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TodoRepository {

    var client: UserApi = RetrofitClient.webService

    val list = MutableLiveData<ToDo>()

   /* fun getTodo(id:Int): LiveData<ToDo>  {

        client.getToDo(id).enqueue(object : Callback<ToDo> {
            override fun onResponse(call: Call<ToDo>, response: Response<ToDo>) {
                TODO("Not yet implemented")
                list.value = response.body()
            }

            override fun onFailure(call: Call<ToDo>, t: Throwable) {
                t.printStackTrace()
            }
        })

        return list
    }*/

    suspend fun getListTodo(id:Int) = client.getToDo(id)

}