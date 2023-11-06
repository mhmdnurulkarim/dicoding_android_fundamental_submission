package com.mhmdnurulkarim.githubuser.data.local

import androidx.room.*
import com.mhmdnurulkarim.githubuser.data.DetailUserResponse

@Dao
interface UserDao {

    @Query("SELECT * FROM user ORDER BY username ASC")
    suspend fun getFavoriteListUser(): List<DetailUserResponse>

    @Query("SELECT * FROM user WHERE username = :username")
    suspend fun getFavoriteDetailUser(username: String): DetailUserResponse

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteUser(user: DetailUserResponse)

    @Delete
    suspend fun deleteFavoriteUser(user: DetailUserResponse)
}