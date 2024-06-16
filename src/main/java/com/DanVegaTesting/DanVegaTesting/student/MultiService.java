package com.DanVegaTesting.DanVegaTesting.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiService {
    private final RegistryService registryService;
    private final StudentService studentService;

    @Autowired
    public MultiService(RegistryService registryService, StudentService studentService) {
        this.registryService = registryService;
        this.studentService = studentService;
    }
}
