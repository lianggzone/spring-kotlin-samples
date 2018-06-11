package com.lianggzone.demo.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.lianggzone.demo.kotlin"])
open class SpringKotlinApplication{
    fun main(args: Array<String>) {
        SpringApplication.run(SpringKotlinApplication::class.java, *args)
    }
}


