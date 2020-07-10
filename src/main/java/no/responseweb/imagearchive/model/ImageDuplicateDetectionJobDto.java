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
public class ImageDuplicateDetectionJobDto {
    private FileItemDto fileItemDto;
    @Deprecated
    private UUID fileItemIdQuery;
    @Deprecated
    private UUID fileItemIdTarget;
}
