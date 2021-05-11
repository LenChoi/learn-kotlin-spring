package com.example.mvc.controller.delete

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class DeleteApiController {

    // 1. path variable
    // 2. request param

    @DeleteMapping(path = ["/delete-mapping"])
    fun deleteMapping(
        @RequestParam name: String,
        @RequestParam(name = "age") _age: Int
    ): String {
        println(name)
        println(_age)
        return name + " " + _age
    }

    @DeleteMapping(path = ["/delete-mapping/name/{name}/age/{age}"])
    fun deleteMappingPath(
        @PathVariable(name = "name") _name: String,
        @PathVariable(name = "age") _age: Int
    ): String{
        println(_name)
        println(_age)
        return _name + " " + _age
    }
}