package mihalcin.bootweblogic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Patrik.Mihalcin on 09.05.2018
 */
public interface PersonRepo extends CrudRepository<Person, Long> {
}
