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
public class ImageMetadataValueDto {
    private UUID id;
    private UUID fileItemId;
    private UUID tagId;
    private String value;
}
