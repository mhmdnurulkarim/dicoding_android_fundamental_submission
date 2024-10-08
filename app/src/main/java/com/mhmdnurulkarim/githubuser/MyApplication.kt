package com.mhmdnurulkarim.githubuser

import android.app.Application
import com.mhmdnurulkarim.core.di.databaseModule
import com.mhmdnurulkarim.core.di.networkModule
import com.mhmdnurulkarim.core.di.repositoryModule
import com.mhmdnurulkarim.githubuser.di.useCaseModule
import com.mhmdnurulkarim.githubuser.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}