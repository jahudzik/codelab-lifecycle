package com.jahu.lifecycle

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.os.SystemClock
import java.util.*

class MainViewModel : ViewModel() {

    var startTime = SystemClock.elapsedRealtime()
    val elapsedTime = MutableLiveData<Long>()

    init {
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                val newValue = (SystemClock.elapsedRealtime() - startTime) / 1000
                elapsedTime.postValue(newValue)
            }
        }, 1000, 1000)
    }

}
