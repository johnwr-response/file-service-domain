package no.responseweb.imagearchive.repositories;

import no.responseweb.imagearchive.domain.FilePath;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FilePathRepository extends JpaRepository<FilePath, UUID> {
}
