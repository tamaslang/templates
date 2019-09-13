package samples

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldKtTest{

    @Test
    fun `sayHello should say hello to input name 'John'`() {
        val name = "John"
        assertThat(sayHello(name)).isEqualTo("Hello John")
    }

    @Test
    fun `sayHello should say hello to an empty input name`() {
        val name = ""
        assertThat(sayHello(name)).isEqualTo("Hello")
    }

    @Test
    fun `sayHello should say hello to an empty input name by default parameter`() {
        assertThat(sayHello()).isEqualTo("Hello")
    }

}