// data/repository/UserRepositoryImpl.kt
package com.example.userprofileapp.data.repository

import com.example.userprofileapp.domain.model.User
import com.example.userprofileapp.domain.repository.UserRepository
import com.example.userprofileapp.data.datasource.UserDataSource
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource
) : UserRepository {
    override suspend fun getUserById(userId: Int): User {
        return userDataSource.fetchUser(userId)
    }
}
