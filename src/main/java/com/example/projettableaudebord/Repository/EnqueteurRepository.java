
package com.example.projettableaudebord.Repository;
import com.example.projettableaudebord.models.Enqueteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnqueteurRepository extends CrudRepository<Enqueteur, Integer> {
     }
