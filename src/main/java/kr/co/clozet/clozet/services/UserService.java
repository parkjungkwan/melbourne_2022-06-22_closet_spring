package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.User;
import kr.co.clozet.clozet.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO login(UserDTO user);
    Messenger logout(HttpServletRequest request);
    List<User> findAll();
    List<User> findAll(Sort sort);
    Page<User> findAll(Pageable pageable);

    Messenger count();

    Messenger delete(User user);

    Messenger save(UserDTO user);

    Optional<User> findById(Long userId);

    Messenger existsById(String userid);

    Messenger getOne(Long id);
    //custom
    Messenger change(User user);

    List<User> findByUserName(String username);

    Messenger update(User user);

    void removeUser(String userId);
}
