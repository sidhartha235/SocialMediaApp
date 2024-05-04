package cloud.rest.socialmediaapp.Repositories;

import cloud.rest.socialmediaapp.Instances.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    // No additional methods needed here, as CrudRepository provides CRUD operations out of the box
}
