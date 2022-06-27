package com.example.newsappmvvmproject.ui.db

import androidx.room.TypeConverter
import com.example.newsappmvvmproject.ui.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}