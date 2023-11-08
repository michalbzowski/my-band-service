package pl.bzowski;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MusicianDto {
    private UUID rowId;
    private UUID entityUuid;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
