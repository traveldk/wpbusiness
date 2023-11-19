package az.traveldk.wpbusiness.dto.request;

import lombok.Data;


@Data
public class MessageDto {
    private String from;
    private String id;
    private String timestamp;
    private String type;
    private TextDto text;
}
