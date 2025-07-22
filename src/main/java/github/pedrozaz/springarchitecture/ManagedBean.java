package github.pedrozaz.springarchitecture;

import github.pedrozaz.springarchitecture.todos.TodoEntity;
import github.pedrozaz.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagedBean {

    // 4 different ways

    @Autowired
    private TodoValidator validator;

    @Autowired
    public ManagedBean(TodoValidator validator) {
        this.validator = validator;
    }

    public void use() {
        var todo = new TodoEntity();
        validator.validate(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}

