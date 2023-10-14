package sv.edu.ufg.clinica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //se debe colocar para evitar bean java.lang.object
public interface IGenericRepo<T, ID> extends JpaRepository<T, ID> {
}
