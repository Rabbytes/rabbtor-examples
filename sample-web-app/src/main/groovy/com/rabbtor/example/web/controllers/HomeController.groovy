package com.rabbtor.example.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping(name = "home")
class HomeController
{
    @RequestMapping(path = "/")
    def index() {
        return '/home/index'
    }


}
