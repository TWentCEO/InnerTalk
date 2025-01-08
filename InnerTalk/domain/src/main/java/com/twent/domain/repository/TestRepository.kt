package com.twent.domain.repository

import com.twent.domain.model.TestModel

interface TestRepository {
    fun getTestData() : TestModel
}