package sv.edu.ufg.clinica.service.impl;

import sv.edu.ufg.clinica.repo.IGenericRepo;
import sv.edu.ufg.clinica.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {
    //protected abstract JpaRepository<T, ID> getRepo(); //creams un repo generico abstracto ANTES pero cambia IGENERICREPO
    protected abstract IGenericRepo<T, ID> getRepo(); //creams un repo generico abstracto

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) {
        return getRepo().save(t);
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public void delete(ID id) {
        getRepo().deleteById(id);
    }

}
