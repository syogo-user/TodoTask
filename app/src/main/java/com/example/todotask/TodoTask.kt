package com.example.todotask

import android.app.Application
import io.realm.Realm

class TodoTask: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}