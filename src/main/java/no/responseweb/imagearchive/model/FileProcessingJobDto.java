package no.responseweb.imagearchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileProcessingJobDto {
    private FileStoreRequestTypeDto fileStoreRequestType;
    private FileItemDto fileItemDto;
    private FileProcessingJobForwarderConfig config;
}
