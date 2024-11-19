package com.learning.libraryManagerSpringBoot.titile;

import lombok.Value;

@Value
public class CheckoutItemDTO {
    private Long itemPhysicalId;
    private String name;
}
