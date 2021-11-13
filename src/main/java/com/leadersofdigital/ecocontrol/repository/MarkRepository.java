package com.leadersofdigital.ecocontrol.repository;

import com.leadersofdigital.ecocontrol.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
