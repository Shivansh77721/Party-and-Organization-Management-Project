package com.springcrud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.entity.Party;

public interface PartyRepository extends JpaRepository<Party, Long> {
}