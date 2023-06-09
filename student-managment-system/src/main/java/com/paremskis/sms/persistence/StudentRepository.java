package com.paremskis.sms.persistence;



import com.paremskis.sms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository <Student, Long>{


}
