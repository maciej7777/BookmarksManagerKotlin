package com.uniejewskim.bookmarks.model

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "BOOKMARK")
class Bookmark(
        @Id
        //@Type(type = "uuid")
        val id: UUID = UUID.randomUUID(),
        val url: String,
        val description: String,
        @ManyToMany()
        val tags: List<Tag>
)
