package com.kyosuke.browser.domain.model

data class Bookmark(
    val id: Long = 0,
    val title: String,
    val url: String,
    val timestamp: Long = System.currentTimeMillis()
)
