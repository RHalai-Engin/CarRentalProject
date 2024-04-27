package co.pragra.learning.mycarrentalproject.services.auth;

import co.pragra.learning.mycarrentalproject.dto.SignupRequest;
import co.pragra.learning.mycarrentalproject.dto.UserDto;
import org.springframework.stereotype.Service;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
