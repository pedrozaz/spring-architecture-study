package github.pedrozaz.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    //* @Autowired
    private TodoRepository repository;

    //* @Autowired
    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity save(TodoEntity newTodo) {
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo) {
        repository.save(todo);
    }

    public TodoEntity searchById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
