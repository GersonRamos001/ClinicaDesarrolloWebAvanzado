package sv.edu.ufg.clinica.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.ufg.clinica.model.Patient;
import sv.edu.ufg.clinica.repo.IGenericRepo;
import sv.edu.ufg.clinica.repo.IPatienRepo;
import sv.edu.ufg.clinica.service.IPatientService;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl extends CRUDImpl<Patient, Integer> implements IPatientService {

    @Autowired
    private IPatienRepo miRepo;

    @Override
    protected IGenericRepo<Patient, Integer> getRepo() {
        return miRepo;
    }

    @Override
    public Patient save(Patient miPaciente) {
        return miRepo.save(miPaciente);
    }

    @Override
    public Patient update(Patient miPaciente) {
        return miRepo.save(miPaciente);
    }

    @Override
    public Patient findById(Integer id) {
        Optional<Patient> op = miRepo.findById(id);
        return  op.isPresent() ? op.get() : new Patient();
    }

    @Override
    public List<Patient> findAll() {
        return miRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        miRepo.deleteById(id);
    }
}
