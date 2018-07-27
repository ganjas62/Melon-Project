package com.melon.demodao.basicdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melon.demoentity.model.Item;

public interface ItemDao extends JpaRepository<Item, String> {

}
