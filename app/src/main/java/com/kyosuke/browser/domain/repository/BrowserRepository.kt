package com.kyosuke.browser.domain.repository

import com.kyosuke.browser.domain.model.Bookmark
import kotlinx.coroutines.flow.Flow

interface BrowserRepository {
    fun getBookmarks(): Flow<List<Bookmark>>
    suspend fun addBookmark(bookmark: Bookmark)
    suspend fun deleteBookmark(bookmark: Bookmark)
}
