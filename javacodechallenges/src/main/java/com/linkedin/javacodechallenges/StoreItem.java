package com.linkedin.javacodechallenges;

import java.util.Collection;
import java.util.Optional;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor

public class StoreItem {
  private String name;
  private double retailPrice;
  private double discount;

  public static Optional<StoreItem> findLeastExpensive(Collection<StoreItem> items) {
    double leastExpensive = 10000;
    StoreItem leastExpensiveItem = null;
    for (StoreItem item : items) {
      double price = item.getRetailPrice()*(1-item.getDiscount());
      if (price < leastExpensive) {
        leastExpensive = price;
        leastExpensiveItem = item;
      }
    }
    return Optional.ofNullable(leastExpensiveItem);
  }

  @Override
  public String toString() {
    return "Name: " + getName() + ", " + "Retail price: " + getRetailPrice() + ", " + "Discount " + getDiscount();
  }
}