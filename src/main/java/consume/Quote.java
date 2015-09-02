package consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by Larry on 2015/9/2.
 *It also uses Project Lombok’s @Data annotation, which provides a getter,
 * a setter, a toString, and other supporting methods.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;
}
