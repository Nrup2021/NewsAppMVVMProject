package com.example.newsappmvvmproject.ui.repository

import com.example.newsappmvvmproject.ui.api.RetrofitInstance
import com.example.newsappmvvmproject.ui.db.ArticleDatabase
import com.example.newsappmvvmproject.ui.models.Article

// get data from DB and API

class NewsRepository(
    val db: ArticleDatabase
) {
    // API Operations
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)


    // DB Operations
    suspend fun upsert(article: Article) = db.getArticleDAO().upsert(article)

    fun getSavedNews() = db.getArticleDAO().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDAO().deleteArticle(article)
}