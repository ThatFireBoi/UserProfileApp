// domain/usecase/GetUserUseCaseImpl.kt
package com.example.userprofileapp.domain.usecase

import com.example.userprofileapp.domain.model.User
import com.example.userprofileapp.domain.repository.UserRepository
import javax.inject.Inject

class GetUserUseCaseImpl @Inject constructor(
    private val userRepository: UserRepository
) : GetUserUseCase {
    override suspend fun execute(userId: Int): User {
        return userRepository.getUserById(userId)
    }
}
