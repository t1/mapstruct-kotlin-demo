package p;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MyMapper {
    @Mapping(target = "bax", source = "bar")
    PojoB toB(PojoA a);
}
