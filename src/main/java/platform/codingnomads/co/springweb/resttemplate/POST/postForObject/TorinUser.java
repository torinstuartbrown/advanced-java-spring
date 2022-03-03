package platform.codingnomads.co.springweb.resttemplate.POST.postForObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TorinUser {
    private String email;
    private String first_name;
    private String last_name;
    private long created_at;
    private long updated_at;
}


