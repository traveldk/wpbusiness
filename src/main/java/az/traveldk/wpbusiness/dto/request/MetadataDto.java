package az.traveldk.wpbusiness.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class MetadataDto {
    private String display_phone_number;
    @JsonProperty("phone_number_id")
    private String phoneNumberId;
}
