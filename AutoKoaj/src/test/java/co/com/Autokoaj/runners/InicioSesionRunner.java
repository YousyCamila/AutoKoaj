package co.com.Autokoaj.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/InicioSesion_Koaj.feature",
        glue = {"co.com.Autokoaj.stepsdefinitions", "co.com.Autokoaj.utils.hooks"},
        snippets = SnippetType.CAMELCASE)
public class InicioSesionRunner {
}
