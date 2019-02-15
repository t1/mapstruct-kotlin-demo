package test;

import org.junit.jupiter.api.Test;
import p.MyMapper;
import p.MyMapperImpl;
import p.PojoA;
import p.PojoB;

import static org.assertj.core.api.Assertions.assertThat;

class MyMapperTest {
    private final MyMapper mapper = new MyMapperImpl();

    @Test
    void shouldMapAtoB() {
        PojoA a = new PojoA();
        a.foo = "foos";
        a.bar = "bars";
        a.primitiveBool = true;

        PojoB b = mapper.toB(a);

        assertThat(b.foo).isEqualTo("foos");
        assertThat(b.bax).isEqualTo("bars");
        assertThat(b.primitiveBool).isTrue();
    }
}
