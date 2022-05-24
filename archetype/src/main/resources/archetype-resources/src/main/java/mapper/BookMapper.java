package ${package}.mapper;

import com.viettel.vtskit.common.mapper.IMapper;
import ${package}.domain.Book;
import ${package}.dto.BookDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper extends IMapper<Book, BookDTO> {

}
