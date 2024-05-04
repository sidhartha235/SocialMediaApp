import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    // No additional methods needed here, as CrudRepository provides CRUD operations out of the box
}