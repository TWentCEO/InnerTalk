package com.twent.data.repository

import com.twent.data.database.TestDatabase
import com.twent.data.model.toDomainModel
import com.twent.domain.model.TestModel
import com.twent.domain.repository.TestRepository

class TestRepositoryImpl(val dataBase: TestDatabase ): TestRepository{
    override fun getTestData(): TestModel {
        return dataBase.getTestModelResponse().toDomainModel()
    }
}