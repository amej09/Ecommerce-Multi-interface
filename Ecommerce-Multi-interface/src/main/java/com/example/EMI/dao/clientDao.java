package com.example.EMI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EMI.bean.client;

@Repository
public interface clientDao extends JpaRepository<client, Long>  {

}
