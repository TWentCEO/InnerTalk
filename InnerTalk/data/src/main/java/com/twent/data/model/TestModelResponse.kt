package com.twent.data.model

import com.twent.domain.model.TestModel

class TestModelResponse(val name: String?)

fun TestModelResponse.toDomainModel() : TestModel? {
    if (name != null) {
        return TestModel(name)
    }
    return null
}