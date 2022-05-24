package com.example.gqlone

import graphql.scalars.ExtendedScalars
import graphql.schema.GraphQLScalarType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@SpringBootApplication
class GqloneApplication

fun main(args: Array<String>) {
    runApplication<GqloneApplication>(*args)
}

// conf
@Configuration
class Conf {
    @Bean
    fun longType(): GraphQLScalarType {
        return ExtendedScalars.GraphQLLong
    }
}

// controller
@Controller
class Test() {
    @QueryMapping
    fun test(@Argument input: Long) = 123123123L
}