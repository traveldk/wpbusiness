package az.traveldk.wpbusiness.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContactDto {
    private ProfileDto profile;
    @JsonProperty("wa_id")
    private String whatsappId;
}
