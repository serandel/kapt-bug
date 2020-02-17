import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class JUnitExtension : AfterEachCallback {
    override fun afterEach(context: ExtensionContext) {
        println("afterEach from extension")
    }
}
