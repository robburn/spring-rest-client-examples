package guru.springframework.api.domain;

import java.util.List;

public class UserData {
    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    List<User> data;
}
