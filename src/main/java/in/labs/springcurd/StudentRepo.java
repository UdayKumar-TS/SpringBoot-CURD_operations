package in.labs.springcurd;

import in.labs.springcurd.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,Integer> {

}
