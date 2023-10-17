package com.example.projettableaudebord.Repository;
import com.example.projettableaudebord.models.Employe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeRepository extends CrudRepository<Employe,Integer> {
}
