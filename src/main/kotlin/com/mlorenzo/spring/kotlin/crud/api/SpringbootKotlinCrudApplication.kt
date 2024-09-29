package com.mlorenzo.spring.kotlin.crud.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

// Nota: Por defecto una clase de Kotlin es final. Para hacerla no final, añadimos el modificador "open" a la clase.
@SpringBootApplication
open class SpringbootKotlinCrudApplication

fun main(args: Array<String>) {
	SpringApplication.run(SpringbootKotlinCrudApplication::class.java, *args)
}
