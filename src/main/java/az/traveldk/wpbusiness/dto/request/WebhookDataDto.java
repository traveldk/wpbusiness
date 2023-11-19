package az.traveldk.wpbusiness.dto.request;

import lombok.Data;

@Data
public class WebhookDataDto {
    private String field;
    private ValueDto value;
}
