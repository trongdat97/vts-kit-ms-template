package ${package}.dto;

import javax.validation.constraints.NotEmpty;

public class UpdateBookDTO extends BookDTO{

    @Override
    @NotEmpty(message = "id must not empty")
    public String getId() {
        return super.getId();
    }
}
