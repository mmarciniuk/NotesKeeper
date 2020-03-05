package pl.mm.notesKeeper.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController extends RestControllerBase {

    @GetMapping("/helloWorld")
    public String getHelloWorld() {
        return "Hello world";
    }

}
