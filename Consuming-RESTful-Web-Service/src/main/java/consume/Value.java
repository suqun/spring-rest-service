package consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by Larry on 2015/9/2.
 * It’s annotated with @JsonIgnoreProperties from the Jackson JSON processing library
 * to indicate that any properties not bound in this type should be ignored.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;
}
