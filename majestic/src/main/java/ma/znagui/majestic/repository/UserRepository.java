package ma.znagui.majestic.repository;

import ma.znagui.majestic.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findByUserName(String userName);
}
