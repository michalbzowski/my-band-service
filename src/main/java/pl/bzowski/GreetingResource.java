package pl.bzowski;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/musicians")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<MusicianDto> hello() {
        return Set.of(new MusicianDto(UUID.randomUUID(), UUID.randomUUID(), "FN", "SN", "123"));
    }
}
