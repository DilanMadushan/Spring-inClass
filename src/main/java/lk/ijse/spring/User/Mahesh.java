package lk.ijse.spring.User;

import lk.ijse.spring.context.BakeryItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
     private BakeryItems bakeryItems;

    public void setBakeryItems(BakeryItems bakeryItems) {
        this.bakeryItems = bakeryItems;
    }
}
