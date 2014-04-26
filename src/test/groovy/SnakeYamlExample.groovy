import org.yaml.snakeyaml.representer.BaseRepresenter
import spock.lang.Specification

class SnakeYamlExample extends Specification {

  def "demonstrate working example"() {
    expect:
    new TestRepresenter() instanceof BaseRepresenter
  }

  def "demonstrate incompatible dependency"() {
    expect:
    new TestRepresenter(true) instanceof BaseRepresenter
  }
}
