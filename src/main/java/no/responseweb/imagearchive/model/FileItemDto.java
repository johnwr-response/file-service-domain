package no.responseweb.imagearchive.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileItemDto {
    private UUID id;
    private Long version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    private UUID fileStorePathId;
    private String filename;
    private Long size;
    private boolean locallyVisited = false;
    private boolean locallyChanged = false;
    @JsonIgnore
    private byte[] thumbnail;
}
