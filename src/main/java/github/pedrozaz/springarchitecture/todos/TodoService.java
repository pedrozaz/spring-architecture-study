package github.pedrozaz.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    //* @Autowired
    private TodoRepository repository;
    private TodoValidator validator;
    private EmailSender sender;

    //* @Autowired
    public TodoService(TodoRepository repository, TodoValidator validator, EmailSender sender) {
        this.repository = repository;
        this.validator = validator;
        this.sender = sender;
    }

    public TodoEntity save(TodoEntity newTodo) {
        validator.validate(newTodo);
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getConcluded() == Boolean.TRUE ? "successfully" : "unsuccessfully";
        sender.sendMsg("Todo description: " + todo.getDescription() + "was updated" + status);
    }

    public TodoEntity searchById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
