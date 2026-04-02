package times.TimeSheet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import times.TimeSheet.model.User;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User , UUID> {
}
