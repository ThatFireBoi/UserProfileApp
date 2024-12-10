// data/datasource/UserDataSource.kt
package com.example.userprofileapp.data.datasource

import com.example.userprofileapp.domain.model.User

interface UserDataSource {
    suspend fun fetchUser(userId: Int): User
}
