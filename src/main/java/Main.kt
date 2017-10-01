// Copyright © FunctionalKotlin.com 2017. All rights reserved.

sealed class Result<out A, out E>

data class Success<out A, out E>(val value: A) : Result<A, E>()

data class Failure<out A, out E>(val error: E) : Result<A, E>()