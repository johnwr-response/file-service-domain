package no.responseweb.imagearchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MediaTypeDto {
    private UUID id;
    private String type;
    private String subtype;
    private String parameter;
    public String mediaType() {
        if (type != null) {
            String sRet = type;
            return (subtype != null) ? sRet + "/" + subtype : sRet;
        }
        return null;
    }
    public String mediaTypeWithParameter() {
        if (type != null && parameter != null) {
            return mediaType() + "; " + parameter;
        }
        return mediaType();
    }
}
