package com.example.workingmanager

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
private val TAG = "MyService"
class MyService(context: Context, params: WorkerParameters) : Worker(context, params){
    override fun doWork(): Result {
        Log.d(TAG, "doWork: Ishlayapti")
        return Result.success()
    }
}