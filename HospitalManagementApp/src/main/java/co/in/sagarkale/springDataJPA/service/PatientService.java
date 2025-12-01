package co.in.sagarkale.springDataJPA.service;

import co.in.sagarkale.springDataJPA.entity.*;
import co.in.sagarkale.springDataJPA.repository.DepartmentRepository;
import co.in.sagarkale.springDataJPA.repository.DoctorRepository;
import co.in.sagarkale.springDataJPA.repository.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Patient addPatientInsurance(Long patientId, Insurance insurance){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);

        insurance.setPatient(patient);

        return patient;
    }

    @Transactional
    public Patient schedulePatientAppointment(Long patientId, Long doctorId, Appointment appointment){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment);
        doctor.getAppointments().add(appointment);

        return patient;
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }

    public void addDoctorToDepartment(Long departmentId, Long doctorId){
        Department department = departmentRepository.findById(departmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        department.getDoctors().add(doctor);
        departmentRepository.save(department);
    }

}
