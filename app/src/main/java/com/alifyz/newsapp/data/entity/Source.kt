package com.alifyz.newsapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "sources")
data class Source (
    @PrimaryKey(autoGenerate = false)
    var newsId : Int,
    @SerializedName("id")
    var sourceId: String?,
    @SerializedName("name")
    var name: String?
)