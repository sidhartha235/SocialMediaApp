package cloud.rest.socialmediaapp.Repositories;

import cloud.rest.socialmediaapp.Instances.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // No additional methods needed here, as CrudRepository provides CRUD operations out of the box
}
