package ${package}.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private String id;

    @NotEmpty(message = "{validation.book.nameNotEmpty}")
    private String name;

    @NotEmpty(message = "{validation.book.authorNotEmpty}")
    private String author;

}
