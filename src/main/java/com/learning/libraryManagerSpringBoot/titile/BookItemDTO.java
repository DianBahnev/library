package com.learning.libraryManagerSpringBoot.titile;

import lombok.Value;

@Value
public class BookItemDTO {
    Long itemPhysicalId;
    String name;
    String author;
}
