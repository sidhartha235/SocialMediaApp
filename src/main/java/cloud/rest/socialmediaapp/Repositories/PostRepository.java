package cloud.rest.socialmediaapp.Repositories;

import cloud.rest.socialmediaapp.Instances.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // No additional methods needed here, as JpaRepository provides CRUD operations out of the box
}
