package com.uniejewskim.bookmarks.controller

import com.uniejewskim.bookmarks.model.Bookmark
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*
import java.util.Collections.emptyList

@RestController()
@RequestMapping("/bookmarks")
class BookmarksController {
    @GetMapping("/add")
    fun addBookmark() = "Controller"

    @GetMapping("/get")
    fun getByUuid(@RequestParam(value = "id") id: UUID) = run {
        var b = Bookmark(UUID.randomUUID(), " ", " ", emptyList())
        "Controller"
    }

    @GetMapping("")
    fun showAllBookmarks() = "show"
}