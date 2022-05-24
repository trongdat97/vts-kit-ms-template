package ${package}.domain;

import ${package}.utils.CommonUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {
    private String id;
    private String name;
    private String author;

    public Book(String name, String author){
        this.id = CommonUtils.randomString();
        this.name = name;
        this.author = author;
    }
}
