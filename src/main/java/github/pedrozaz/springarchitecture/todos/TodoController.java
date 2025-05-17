package github.pedrozaz.springarchitecture.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todoEntity) {
        try {
            return this.service.save(todoEntity);
        }
        catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    @PutMapping("{id}")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todoEntity) {
        todoEntity.setId(id);
        service.updateStatus(todoEntity);
    }

    @GetMapping("{id}")
    public TodoEntity find(@PathVariable("id") Integer id) {
        return service.searchById(id);
    }
}
