package uce.edu.ec.appbooks.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AuthorDto {
    private Integer id;
    private String firstName;
    private String lastName;
}
