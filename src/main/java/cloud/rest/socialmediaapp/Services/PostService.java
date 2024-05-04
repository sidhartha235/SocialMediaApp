import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void updatePost(Post post) {
        postRepository.save(post);
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }
}
