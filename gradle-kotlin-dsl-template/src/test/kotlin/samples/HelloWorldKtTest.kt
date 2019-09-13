package samples

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class HelloWorldKtTest{

    @Test
    fun `hello should say hello to input name`() {
        val name = "John"
        assertThat(sayHello(name)).isEqualTo("Hello John")
    }
}