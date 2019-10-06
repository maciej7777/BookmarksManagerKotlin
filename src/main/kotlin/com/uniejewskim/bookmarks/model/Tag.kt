package com.uniejewskim.bookmarks.model

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "TAG")
class Tag(
        @Id
        //@Type(type = "uuid")
        val id: UUID,
        val name: String,
        @ManyToMany()
        val bookmarks: List<Bookmark>
)