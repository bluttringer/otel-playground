package com.ben.demo.web;

import com.ben.demo.dto.SomeEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/someEntities")
public class DemoController {

    @GetMapping
    public List<SomeEntity> getSomeEntities() {
        return List.of(
            SomeEntity.builder()
                    .name("test")
                    .description("it's the description of test").build()
        );
    }
}
