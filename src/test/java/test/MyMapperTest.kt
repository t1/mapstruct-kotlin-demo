package test

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import p.MyMapperImpl
import p.PojoA

class MyMapperTest {
    private val mapper = MyMapperImpl()

    @Test fun shouldMapAtoB() {
        val a = PojoA(
            foo = "foos",
            bar = "bars",
            ball = "ball"
        )

        val b = mapper.toB(a)

        assertThat(b.fox).isEqualTo("foos")
        assertThat(b.bax).isEqualTo("bars")
        assertThat(b.ball).isEqualTo("ball")
    }
}
