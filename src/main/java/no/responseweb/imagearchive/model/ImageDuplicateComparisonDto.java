package no.responseweb.imagearchive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageDuplicateComparisonDto {
    private int possibleMatches;
    private int goodMatches;
    public int score() {
        return (possibleMatches==0) ? 0 : 100*goodMatches/possibleMatches;
    }
    public boolean identical() {
        return score() == 100;
    }
    public boolean candidate() {
        return score() > 1;
    }
    public boolean probable() {
        return score() > 10;
    }
}
