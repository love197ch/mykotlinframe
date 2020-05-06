package com.dz.mykotlin.model.api

class ApiException(var code: Int, override var message: String) : RuntimeException()