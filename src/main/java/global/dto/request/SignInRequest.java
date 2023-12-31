package global.dto.request;

import global.validations.EmailValid;
import jakarta.validation.Valid;

/**
 * Abdyrazakova Aizada
 */
public record SignInRequest(
        @EmailValid
        String email,
        String password
) {
}
