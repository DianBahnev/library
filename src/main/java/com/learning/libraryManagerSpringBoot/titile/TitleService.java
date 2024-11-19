package com.learning.libraryManagerSpringBoot.titile;

public interface TitleService {

    BookItem addBookItem(BookItemDTO bookItemDTO);
    CheckoutItem checkoutItem(CheckoutItemDTO checkoutItemDTO);
}
