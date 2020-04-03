package newPackage;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRegistrationController {

    private Map<String,UserRegistrationRequest>database = new HashMap<>();
    @PostMapping(value="/register",consumes = "application/json",produces="application/json")
    public UserRegistrationResponse processUserRegistration(@RequestBody UserRegistrationRequest request){


        database.put(request.getVoucherCode(),request);


        UserRegistrationResponse response = new UserRegistrationResponse();
        response.setMessage("Registratioon was successful. Code="+System.currentTimeMillis());
        return response;
    }
}
