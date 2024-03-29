package uce.edu.ec.appbooks.dtos;

import lombok.Data;
import lombok.ToString;
import uce.edu.ec.appbooks.model.Book;

import java.math.BigDecimal;

@Data
@ToString
public class BookDto {
    private Integer id;
    private String isbn;
    private String title;
    private BigDecimal price;
    private String authorName;

    public static BookDto from(Book obj) {
        BookDto ret = new BookDto();

        ret.setId(obj.getId());
        ret.setIsbn(obj.getIsbn());
        ret.setPrice(obj.getPrice());
        ret.setTitle(obj.getTitle());

        return ret;
    }
}
