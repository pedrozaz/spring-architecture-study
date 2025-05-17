package github.pedrozaz.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    public void sendMsg(String msg) {
        System.out.println("Email sent: " + msg);
    }
}
