package test

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import p.MyMapperImpl
import p.PojoA

class MyMapperTest {
    private val mapper = MyMapperImpl()

    @Test fun shouldMapAtoB() {
        val a = PojoA()
        a.foo = "foos"
        a.bar = "bars"
        a.isPrimitiveBool = true

        val b = mapper.toB(a)

        assertThat(b.fox).isEqualTo("foos")
        assertThat(b.bax).isEqualTo("bars")
        assertThat(b.isPrimitiveBool).isTrue()
    }
}
