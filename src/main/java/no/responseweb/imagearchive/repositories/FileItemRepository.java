package no.responseweb.imagearchive.repositories;

import no.responseweb.imagearchive.domain.FileItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileItemRepository extends JpaRepository<FileItem, UUID> {
}
