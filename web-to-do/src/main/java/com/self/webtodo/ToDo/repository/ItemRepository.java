package com.self.webtodo.ToDo.repository;

import com.self.webtodo.ToDo.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Optional<Item> findById(Long id);

}
