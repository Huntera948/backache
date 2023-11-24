package com.example.demo.dao;

import com.example.demo.entities.InhousePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface InhousePartRepository extends JpaRepository<InhousePart, Long> {
}
