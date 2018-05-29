package com.example.swaggercomponentindexerbug;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;
import lombok.Data;



@RestController("/api")
public class ExampleController {

    @Data
    public static class ExampleRequest {
        private String content;
    }

    @Builder
    public static class ExampleResponse {
        private String content;
    }

    @PutMapping
    public ExampleResponse action(@RequestBody ExampleRequest exampleRequest) {
        return ExampleResponse.builder().content("Lorem Ipsum").build();
    }
}
