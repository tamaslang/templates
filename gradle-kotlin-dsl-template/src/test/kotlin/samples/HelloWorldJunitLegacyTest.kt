package samples

import org.assertj.core.api.Assertions.assertThat

/**
 * Test class using junit4 engine
 */
class HelloWorldJunitLegacyTest{

    @org.junit.Test
    fun `sayHello should say hello to input name 'John'`() {
        val name = "John"
        assertThat(sayHello(name)).isEqualTo("Hello John")
    }

}