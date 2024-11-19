package com.learning.libraryManagerSpringBoot.titile;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/title")
public class TitleController {

    private final TitleRepository titleRepository;
    private final TitleService titleService;

    @PostMapping("/newTitle")
    public ResponseEntity<Title> addNewTitle(@RequestBody Title title){
        return ResponseEntity.ok(titleRepository.save(title));
    }

    @PostMapping("/newTitles")
    public ResponseEntity<Iterable<Title>> addNewTitles(@RequestBody List<Title> titles){
        return ResponseEntity.ok(titleRepository.saveAll(titles));
    }

    @PostMapping("/newBookItem")
    public ResponseEntity<BookItem> addNewBookItem(@RequestBody BookItemDTO bookItemDTO){
        return ResponseEntity.ok(titleService.addBookItem(bookItemDTO));
    }

    @PostMapping("/newCheckoutItem")
    public ResponseEntity<CheckoutItem> addNewBookItems(@RequestBody CheckoutItemDTO checkoutItemDTO){
        return ResponseEntity.ok(titleService.checkoutItem(checkoutItemDTO));
    }
}
