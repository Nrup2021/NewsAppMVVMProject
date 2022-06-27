# NewsAppMVVMProject

News App
---
- Online and Offline data store and listing with pagination

End Points
---
- BASE URL = https://newsapi.org
- API KEY = cb74cdb845fe4bd081e3488ab6579ff2
- top-headlines = https://newsapi.org/v2/top-headlines?country=us&page=1&apikey=cb74cdb845fe4bd081e3488ab6579ff2
- everything = https://newsapi.org/v2/everything?q=developer&page=1&apikey=cb74cdb845fe4bd081e3488ab6579ff2

Features
---

- MVVM
- Retrofit
- RoomDB
- TypeConverter
- ViewModel
- LiveData
- Coroutine
- Navigation
- Safe Arg
- RecyclerView
- DiffUtils
- Pagination : 20 Page
- Glide Image Loading
- SharedViewModel (NewsViewModel)
- BottomNavigationView
- SealedClass for Success/Error/Loading
- SnackBar for Unod deleted record

3 Tabs
---
- Breaking News
- Saved News
- Search News

API operations
---
- getBreakingNews
- searchNews

DB Operations
---
- upsert for insert and update
- getSavedNews
- deleteArlticle

UI
---
- ArticleFragment -> WebView and Save Floating Button
- BreakingNewsFragment - List of Articles with pagination
- SavedNewsFragment - List of News which are saved to DB
- SearchNewsFragment - Search News From API with pagination

References
---
https://www.youtube.com/watch?v=asuOWE5KuFM&list=PLQkwcJG4YTCRF8XiCRESq1IFFW8COlxYJ&index=1

API Reference
---
https://newsapi.org/
