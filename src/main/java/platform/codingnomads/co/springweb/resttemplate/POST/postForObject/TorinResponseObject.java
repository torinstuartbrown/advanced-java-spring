package platform.codingnomads.co.springweb.resttemplate.POST.postForObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TorinResponseObject {
    private TorinUser data;
    private TorinError error;
    private String status;
}
