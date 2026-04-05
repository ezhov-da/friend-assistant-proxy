package ru.ezhov.friendassistant.proxy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication


@SpringBootApplication
class App

fun main(args: Array<String>) {
//    runApplication<App>(*args)
    val builder = SpringApplicationBuilder(App::class.java)
    builder.headless(true)
    builder.run(*args)
}
