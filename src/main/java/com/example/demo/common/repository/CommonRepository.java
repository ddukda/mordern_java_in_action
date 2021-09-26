package com.example.demo.common.repository;

import com.example.demo.common.entity.CommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepository extends JpaRepository<CommonEntity, Integer> {

}
