package no.responseweb.imagearchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileStoreRequestDto {
    private FileStoreRequestTypeDto fileStoreRequestType;
    private FileStoreDto fileStore;
    private FilePathDto filePath;
    private FileItemDto fileItem;
}
