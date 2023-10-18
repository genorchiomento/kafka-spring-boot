package dev.genorchiomento.kafkaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class HelloResource {
    private final HelloProducer producer;

    public HelloResource(HelloProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/hello/{name}")
    public String hello(
            @PathVariable("name") String name
    ) {
        producer.sendMessage("Hello, %s".formatted(name));
        return "Ok! It's works!";
    }
}
