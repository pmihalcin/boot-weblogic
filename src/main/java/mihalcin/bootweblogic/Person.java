package mihalcin.bootweblogic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Patrik.Mihalcin on 09.05.2018
 */
@Entity
public class Person {

    @Id
    private Long id;
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
