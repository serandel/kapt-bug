import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(JUnitExtension::class)
class RootPackageTest {
    @Test
    fun `this test works because is in the root package with the extension`() {
        println("Test!")
    }
}
