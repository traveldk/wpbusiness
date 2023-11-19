package az.traveldk.wpbusiness.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ValueDto {
    @JsonProperty("messaging_product")
    private String messagingProduct;
    private MetadataDto metadata;
    private ArrayList<ContactDto> contacts;
    private ArrayList<MessageDto> messages;
}
