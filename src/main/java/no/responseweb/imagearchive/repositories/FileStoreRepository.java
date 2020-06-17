package no.responseweb.imagearchive.repositories;

import no.responseweb.imagearchive.domain.FileStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileStoreRepository extends JpaRepository<FileStore, UUID> {
}
