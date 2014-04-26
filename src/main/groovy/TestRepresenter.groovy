import org.yaml.snakeyaml.introspector.PropertyUtils
import org.yaml.snakeyaml.representer.BaseRepresenter

class TestRepresenter extends BaseRepresenter {

  TestRepresenter() {
  }

  TestRepresenter(boolean usePropertyUtils) {
    propertyUtils = new PropertyUtils()
  }

  @Override
  protected boolean ignoreAliases(Object o) {
    return false
  }
}
