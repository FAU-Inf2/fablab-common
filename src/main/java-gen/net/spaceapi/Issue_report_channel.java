
package net.spaceapi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("org.jsonschema2pojo")
public enum Issue_report_channel {

    EMAIL("email"),
    ISSUE_MAIL("issue_mail"),
    TWITTER("twitter"),
    ML("ml");
    private final String value;
    private static Map<String, Issue_report_channel> constants = new HashMap<String, Issue_report_channel>();

    static {
        for (Issue_report_channel c: values()) {
            constants.put(c.value, c);
        }
    }

    private Issue_report_channel(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }

    @JsonCreator
    public static Issue_report_channel fromValue(String value) {
        Issue_report_channel constant = constants.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
