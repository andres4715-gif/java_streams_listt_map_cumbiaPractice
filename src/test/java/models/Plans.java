package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Plans {
    private String client;
    private String providerPlanId;
}
