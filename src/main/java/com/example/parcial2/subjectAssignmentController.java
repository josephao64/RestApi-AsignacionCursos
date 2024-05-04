package com.example.parcial2;

import com.example.parcial2.SubjectAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/subject_assignment")
public class subjectAssignmentController {

    @Autowired
    private SubjectAssignmentService subjectAssignmentService;

    @GetMapping
    public List<SubjectAssignment> getAllSubjectAssignments() {
        return subjectAssignmentService.getAllSubjectAssignments();
    }

    @GetMapping("/{id}")
    public SubjectAssignment getSubjectAssignmentById(@PathVariable Long id) {
        return subjectAssignmentService.getSubjectAssignmentById(id);
    }

    @PostMapping
    public SubjectAssignment createSubjectAssignment(@RequestBody SubjectAssignment subjectAssignment) {
        return subjectAssignmentService.createSubjectAssignment(subjectAssignment);
    }

    @PutMapping("/{id}")
    public SubjectAssignment updateSubjectAssignment(@PathVariable Long id, @RequestBody SubjectAssignment subjectAssignment) {
        return subjectAssignmentService.updateSubjectAssignment(id, subjectAssignment);
    }

    @DeleteMapping("/{id}")
    public void deleteSubjectAssignment(@PathVariable Long id) {
        subjectAssignmentService.deleteSubjectAssignment(id);
    }
}
