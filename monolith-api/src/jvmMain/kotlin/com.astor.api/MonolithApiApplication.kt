package com.astor.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class MonolithApiApplication

fun main(args: Array<String>) {
    runApplication<MonolithApiApplication>(*args)
}