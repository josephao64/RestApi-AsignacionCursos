package com.example.parcial2;

import com.example.parcial2.SubjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectAssignmentRepository extends JpaRepository<SubjectAssignment, Long> {
}
