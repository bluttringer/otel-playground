package com.ben.app.web;

import com.ben.app.dto.SomeEntity;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationHandler;
import io.micrometer.observation.ObservationRegistry;
import io.micrometer.tracing.Span;
import io.micrometer.tracing.handler.DefaultTracingObservationHandler;
import io.micrometer.tracing.handler.PropagatingReceiverTracingObservationHandler;
import io.micrometer.tracing.handler.PropagatingSenderTracingObservationHandler;
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
