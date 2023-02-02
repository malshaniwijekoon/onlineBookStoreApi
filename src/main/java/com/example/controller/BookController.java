package com.example.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user")
public class BookController {

    @GetMapping("/book")
    public String bookList(){
        String url = "https://www.googleapis.com/books/v1/volumes?q=search_term";
        RestTemplate restTemplate = new RestTemplate();
        String bookList = restTemplate.getForObject(url, String.class);
        return bookList;
    }


}
