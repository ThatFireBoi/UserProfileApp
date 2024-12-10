// data/di/AppModule.kt
package com.example.userprofileapp.data.di

import com.example.userprofileapp.data.datasource.UserDataSource
import com.example.userprofileapp.data.datasource.UserDataSourceImpl
import com.example.userprofileapp.data.repository.UserRepositoryImpl
import com.example.userprofileapp.domain.repository.UserRepository
import com.example.userprofileapp.domain.usecase.GetUserUseCase
import com.example.userprofileapp.domain.usecase.GetUserUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserDataSource(): UserDataSource {
        return UserDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideUserRepository(userDataSource: UserDataSource): UserRepository {
        return UserRepositoryImpl(userDataSource)
    }

    @Provides
    @Singleton
    fun provideGetUserUseCase(userRepository: UserRepository): GetUserUseCase {
        return GetUserUseCaseImpl(userRepository)
    }
}
