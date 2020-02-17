package bug

import JUnitExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

// TODO comment this class and the test gradle task will run OK

@ExtendWith(JUnitExtension::class)
class SamplePackageTest {
    @Test
    fun `kapt fails to compile this test`() {
        println("Test from a package!")
    }
}
