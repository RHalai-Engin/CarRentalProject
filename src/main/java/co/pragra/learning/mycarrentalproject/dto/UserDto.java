package co.pragra.learning.mycarrentalproject.dto;

import co.pragra.learning.mycarrentalproject.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;
    private UserRole userRole;
}
