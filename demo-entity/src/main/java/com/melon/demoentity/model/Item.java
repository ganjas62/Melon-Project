package com.melon.demoentity.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = Item.TABLE_NAME)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

  public static final String TABLE_NAME = "item";

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id")
  private String id;

  @Column(name = "item_name")
  private String itemName;

  @Column(name = "item_price")
  private BigDecimal itemPrice;
}
