package no.responseweb.imagearchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileStoreDto {
    private UUID id;
    private String baseServer;
    private String baseShare;
    private String baseFolder;
    private String nickname;
    private String mountPoint;
    private LocalDateTime latestRefresh;
    public String getLocalBaseUri() {
        return File.separator + File.separator + baseServer + File.separator + baseShare + File.separator + baseFolder;
    }
}
