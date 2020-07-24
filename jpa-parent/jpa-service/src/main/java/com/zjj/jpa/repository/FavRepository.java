package com.zjj.jpa.repository;

import com.zjj.jpa.entity.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavRepository extends JpaRepository<Favourite,Integer> {

}
