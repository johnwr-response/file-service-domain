package no.responseweb.imagearchive.model;

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
public class StatusWalkerDto {
    private UUID id;
    private UUID walkerInstanceToken;
    private UUID fileStoreId;
    private Boolean ready;
    private LocalDateTime runningSince;
    private LocalDateTime lastFinished;
    private LocalDateTime lastActiveDate;
}
