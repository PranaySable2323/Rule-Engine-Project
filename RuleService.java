import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RuleService {

    public Node createRule(String ruleString) {
        return rootNode;
    }

    public Node combineRules(List<String> rules) {
        return combinedRoot;
    }

    public boolean evaluateRule(JsonNode ast, Map<String, Object> data) {
    }

}
