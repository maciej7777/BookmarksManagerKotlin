package com.uniejewskim.bookmarks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookmarksManagerApplication

fun main(args: Array<String>) {
	runApplication<BookmarksManagerApplication>(*args)
}
