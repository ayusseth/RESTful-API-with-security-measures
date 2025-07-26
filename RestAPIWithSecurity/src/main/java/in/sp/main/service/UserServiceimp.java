package in.sp.main.service;

import in.sp.main.entities.User;
import in.sp.main.repositroy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimp implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getUser(int id) {
        return userRepo.findById(id);
    }
}
