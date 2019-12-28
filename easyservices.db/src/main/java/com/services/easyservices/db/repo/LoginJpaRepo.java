package com.services.easyservices.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.services.easyservices.db.entity.LoginEntity;

@Repository
public interface LoginJpaRepo extends JpaRepository<LoginEntity, Long>, PagingAndSortingRepository<LoginEntity, Long> {

}
