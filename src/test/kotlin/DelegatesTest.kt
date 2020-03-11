import delegates.Delegates
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class DelegatesTest {
    @Test
    fun test() {
        var d: Int by Delegates.notNull()
        assertFailsWith<IllegalStateException> { d }
        d = 5
        assertEquals(5, d)
    }
}
