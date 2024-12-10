// domain/repository/UserRepository.kt
package com.example.userprofileapp.domain.repository

import com.example.userprofileapp.domain.model.User

interface UserRepository {
    suspend fun getUserById(userId: Int): User
}
