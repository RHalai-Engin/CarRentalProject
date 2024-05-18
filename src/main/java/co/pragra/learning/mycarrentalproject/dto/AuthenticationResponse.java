package co.pragra.learning.mycarrentalproject.dto;

import co.pragra.learning.mycarrentalproject.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;

    private UserRole userRole;

    private long userId;
}
