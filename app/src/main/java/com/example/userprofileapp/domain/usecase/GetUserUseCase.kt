// domain/usecase/GetUserUseCase.kt
package com.example.userprofileapp.domain.usecase

import com.example.userprofileapp.domain.model.User

interface GetUserUseCase {
    suspend fun execute(userId: Int): User
}
