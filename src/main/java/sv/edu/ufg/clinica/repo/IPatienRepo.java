package sv.edu.ufg.clinica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.ufg.clinica.model.Patient;

public interface IPatienRepo  extends IGenericRepo<Patient, Integer> {
}
