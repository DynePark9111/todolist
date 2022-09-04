## todolist

## About

- todolist BE

## Stack

- React (FE)
- Spring Boot Kotlin (BE)
- Docker MySQL (DB)

## Get started

### FE

1. todolist FE [link](https://github.com/DynePark9111/todolist_react)

### DB

1. docker mysql

```
docker run -p 3306:3306 --name todolist -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=todolist -e MYSQL_USER=dyne -e MYSQL_PASSWORD=1234 -d mysql
```

### BE

1.

## API

| Method | URL                 | Request   | Response   | Description         |
| ------ | ------------------- | --------- | ---------- | ------------------- |
| GET    | /                   |           | 404        |                     |
| GET    | /todo               |           | todo Array | get todolist        |
| POST   | /todo               | content\* | todo       | post a todo         |
| DELETE | /todo/:id           |           | 200        | delete a todo       |
| PUT    | /todo/complete/:id  |           | todo       | mark todo completed |
| PUT    | /todo/important/:id |           | todo       | mark todo important |

`* = required`

### Request parameters

| Field     | example        | Description      |
| --------- | -------------- | ---------------- |
| content\* | "walk the dog" | todolist content |

### Response Example

```
todo =
  {
    "id": 1,
    "completed": false,
    "important": false,
    "author": "guest",
    "content": "walk the dog"",
    "createdDate": "2022-09-05T06:04:45.198605",
    "modifiedDate": "2022-09-05T06:04:45.198605"
  }
```
