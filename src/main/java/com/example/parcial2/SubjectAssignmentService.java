package com.example.parcial2;

import com.example.parcial2.SubjectAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubjectAssignmentService {

    @Autowired
    private SubjectAssignmentRepository subjectAssignmentRepository;

    public List<SubjectAssignment> getAllSubjectAssignments() {
        return subjectAssignmentRepository.findAll();
    }

    public SubjectAssignment getSubjectAssignmentById(Long id) {
        return subjectAssignmentRepository.findById(id).orElse(null);
    }

    public SubjectAssignment createSubjectAssignment(SubjectAssignment subjectAssignment) {
        return subjectAssignmentRepository.save(subjectAssignment);
    }

    public SubjectAssignment updateSubjectAssignment(Long id, SubjectAssignment subjectAssignment) {
        if (subjectAssignmentRepository.existsById(id)) {
            subjectAssignment.setId(id);
            return subjectAssignmentRepository.save(subjectAssignment);
        }
        return null;
    }

    public void deleteSubjectAssignment(Long id) {
        subjectAssignmentRepository.deleteById(id);
    }

}
