package p;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MyMapper {
    @Mapping(target = "bax", source = "bar")
    @Mapping(target = "fox", source = "foo")
    PojoB toB(PojoA a);
}
