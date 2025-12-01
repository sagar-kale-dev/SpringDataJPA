package co.in.sagarkale.springDataJPA;

import co.in.sagarkale.springDataJPA.entity.*;
import co.in.sagarkale.springDataJPA.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private PatientService patientService;

    @Test
	void contextLoads() {
	}

    @Test
    void addPatientInsurance(){
        Insurance insurance = Insurance.builder().policyNumber("ABC123").provider("HDFC").validity(LocalDate.of(2025,12,31)).build();
        Patient patient = patientService.addPatientInsurance(1L, insurance);

        System.out.println(patient);
    }

    @Test
    void addPatientAppointment(){
        Appointment appointment = Appointment.builder().reason("Cold and Fever").appointmentTime(LocalDateTime.of(2025, 3, 15, 14, 30)).build();
        Patient patient = patientService.schedulePatientAppointment(1L, 1L, appointment);

        System.out.println(patient);
    }

    @Test
    void getAllPatients(){
        List<Patient> patients = patientService.getAllPatients();
        System.out.println(patients);
    }

    @Test
    void getAllDepartments(){
        List<Department> departments = patientService.getAllDepartment();
        System.out.println(departments);
    }

    @Test
    void addDoctorToDepartment(){
        patientService.addDoctorToDepartment(1L, 1L);
        getAllDepartments();
    }
}
