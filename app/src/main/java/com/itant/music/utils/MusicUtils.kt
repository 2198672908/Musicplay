package com.itant.music.utils

import java.util.concurrent.TimeUnit

/**
 * 根据字节获取大小（MB）
 */
fun getMusicSize(byteSize: Long): String {
    return String.format("大小：%.1fMB", byteSize/1024.0f/1024.0f)
}

/**
 * 获取时长
 */
fun getMusicTotalTime(milliSecond: Long): String {
    val seconds = milliSecond / 1000
    val m = TimeUnit.SECONDS.toMinutes(seconds)
    val s = seconds - m * 60
    return String.format("时长：%02d:%02d", m, s)
}