package com.berriesoft.seausail_api.book;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class BookRequest {

    private Integer id;
    private String author;
    private String isbn;
}
