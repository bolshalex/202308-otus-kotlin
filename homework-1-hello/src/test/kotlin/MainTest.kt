import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun testHelloWorld() {
        val output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))
        main()
        assertEquals("Hello World!\r\n", output.toString(Charsets.UTF_8))
        System.setOut(null)
    }
}