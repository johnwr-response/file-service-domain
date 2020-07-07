package no.responseweb.imagearchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileProcessingJobForwarderConfig {
    private boolean metadataExtractor;
    private boolean faceDetection;
    private boolean duplicateDetection;
    public enum Config {
        ALL, NONE, IMAGES, METADATA_ONLY, FACE_ONLY, DUPLICATE_ONLY
    }

    public FileProcessingJobForwarderConfig(Config config) {
        switch (config) {
            case ALL:
            case IMAGES:
                this.metadataExtractor = true;
                this.faceDetection = true;
                this.duplicateDetection = true;
                break;
            case FACE_ONLY:
                this.faceDetection = true;
                break;
            case METADATA_ONLY:
                this.metadataExtractor = true;
                break;
            case DUPLICATE_ONLY:
                this.duplicateDetection = true;
                break;
            case NONE:
            default:
                break;
        }
    }
}
