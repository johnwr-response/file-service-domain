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
public class FileItemTagLinkDto {
    private UUID id;
    private UUID fileItemId;
    private UUID fixedTagEntityId;
    private UUID fixedTagObjectContextId;
    private UUID tagId;
}
