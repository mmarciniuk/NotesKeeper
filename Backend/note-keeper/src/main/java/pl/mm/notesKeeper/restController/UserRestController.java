package pl.mm.notesKeeper.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mm.notesKeeper.dto.Request;
import pl.mm.notesKeeper.dto.Response;
import pl.mm.notesKeeper.dto.UserDto;
import pl.mm.notesKeeper.service.UserService;

@RequestMapping(UserRestController.Mappings.BASE_MAPPING)
@RestController
public class UserRestController extends RestControllerBase {

    public static class Mappings {
        public static final String BASE_MAPPING = RestControllerBase.Mappings.BASE_MAPPING + "/user";
        public static final String REGISTER = "/register";
    }

    @Autowired
    private UserService userService;

    @PostMapping(Mappings.REGISTER)
    public Response createUser(@RequestBody Request<UserDto> request) {
        return userService.createUser(request);
    }

    @PostMapping("/create2")
    public Response createUser2(@RequestBody UserDto request) {
        return Response.builder()
                .response(request)
                .build();
    }

}
