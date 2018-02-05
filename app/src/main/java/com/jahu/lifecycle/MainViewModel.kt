package com.jahu.lifecycle

import android.arch.lifecycle.ViewModel
import android.os.SystemClock

class MainViewModel : ViewModel() {

    var startTime = SystemClock.elapsedRealtime()

}
