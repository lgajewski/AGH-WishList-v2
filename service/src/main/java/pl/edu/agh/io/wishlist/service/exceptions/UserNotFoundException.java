package pl.edu.agh.io.wishlist.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.edu.agh.io.wishlist.domain.User;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(User user) {
        super("user does not exist: " + user.getUsername());
    }
}
