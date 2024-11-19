package com.learning.libraryManagerSpringBoot.titile;

import com.learning.libraryManagerSpringBoot.user.User;
import com.learning.libraryManagerSpringBoot.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TitleServiceImp implements TitleService{

    private final TitleRepository titleRepository;
    private final BookItemRespository bookItemRespository;
    private final UserRepository userRepository;
    private final CheckoutItemRepository checkoutItemRepository;

    @Override
    public BookItem addBookItem(BookItemDTO bookItemDTO){
        Title title = titleRepository.findTitleByAuthorAndName(bookItemDTO.getAuthor(), bookItemDTO.getName())
                .orElseGet(()->{
                    log.info("Creating new title with author {} and name {}",
                            bookItemDTO.getAuthor(), bookItemDTO.getName());

                    return titleRepository.save(
                            new Title(bookItemDTO.getName(), bookItemDTO.getAuthor()));
                });

        BookItem bookItem = new BookItem(null,
                bookItemDTO.getItemPhysicalId(),
                title);

        BookItem storedBookItem = bookItemRespository.save(bookItem);

        return storedBookItem;
    }

    @Override
    public CheckoutItem checkoutItem(CheckoutItemDTO checkoutItemDTO){
        User user = userRepository.findUserByName(checkoutItemDTO.getName());
        BookItem bookItem = bookItemRespository.findBookItemByItemPhysicalId(checkoutItemDTO.getItemPhysicalId());

        CheckoutItem checkoutItem = new CheckoutItem(null,
                user,
                bookItem,
                false);

        CheckoutItem storedCheckoutItem = checkoutItemRepository.save(checkoutItem);

        return storedCheckoutItem;
    }
}
