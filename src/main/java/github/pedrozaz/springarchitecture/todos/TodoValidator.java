package github.pedrozaz.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validate(TodoEntity todo) {
        if (hasThisDescription(todo.getDescription())) {
            throw new IllegalArgumentException("This description already exists.");
        }
    }

    private boolean hasThisDescription(String description) {
        return repository.existsByDescription(description);
    }
}
