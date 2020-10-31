# BookmarksManagerKotlin

The goal of this project is to create a web application that can keep your bookmarks with a useful hierarchical structure and directories and that can enable you to search for them effectively - basing on titles, descriptions, tags, directories and url'.

## Running
### Docker
To run docker image of mysql db run following commands:

```
cd docker
docker-compose up
```

### Kotlin application
Build project with command:
```
mvn clean install
```

Run class `com.uniejewskim.bookmarks.BookmarksManagerApplicationKt` from the Intellij.