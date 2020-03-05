package pl.mm.notesKeeper.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(RestControllerBase.Mappings.BASE_MAPPING)
@RestController
public abstract class RestControllerBase {

    public static class Mappings {
        public static final String BASE_MAPPING = "/api/v1";
    }


}
