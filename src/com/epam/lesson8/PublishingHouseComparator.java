package com.epam.lesson8;

import java.util.Comparator;

public class PublishingHouseComparator implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    String publishingHouse1 = ( (Book)o1).getPublishingHouse();
    String publishingHouse2 = ( (Book)o2).getPublishingHouse();
    return publishingHouse1.compareTo(publishingHouse2);
  }
}
