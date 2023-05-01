package com.task.tracker.controller.task


import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.http.HttpResponse

@RestController
class TaskController {

    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello, $name!"

    @PostMapping("/")
    fun createProyecto(@RequestBody name: String): ResponseEntity<String> {
        return ResponseEntity.ok("hello")
    }


}