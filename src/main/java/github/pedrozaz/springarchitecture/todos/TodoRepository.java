package github.pedrozaz.springarchitecture.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //optional annotation
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    boolean existsByDescription(String description);
}
