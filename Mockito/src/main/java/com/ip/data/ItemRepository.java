package com.ip.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ip.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
