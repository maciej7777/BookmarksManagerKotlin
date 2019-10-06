package com.uniejewskim.bookmarks.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController()
@RequestMapping("/bookmarks")
class BookmarksController {
    @GetMapping("/add")
    fun addBookmark() = "Controller"

    @GetMapping("/get")
    fun getByUuid(@RequestParam(value = "id") id: UUID) = "Controller"

    @GetMapping("")
    fun showAllBookmarks() = "show"
}