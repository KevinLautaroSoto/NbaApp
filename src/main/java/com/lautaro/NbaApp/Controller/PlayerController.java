package com.lautaro.NbaApp.Controller;

import com.lautaro.NbaApp.Controller.Dto.PlayerDto;
import com.lautaro.NbaApp.Models.Player;
import com.lautaro.NbaApp.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    /**
     * Creates a new player based on the provided PlayerDto object.
     *
     * @param playerDto The PlayerDto object containing information about the player to be created.
     * @throws Exception Throws an exception if an error occurs during player creation.
     */
    @PostMapping
    public void createPlayer(@RequestBody PlayerDto playerDto) {
        playerService.createPlayer(playerDto);
    }

    /**
     * Retrieves all players stored in the database.
     *
     * @return A list containing all Player objects representing existing players.
     */
    @GetMapping
    public List<Player> getAllPlayers() {
       return playerService.getAllPlayers();
    }

    /**
     * Retrieves a specific player based on its unique identifier.
     *
     * @param id The unique identifier (Long) of the player to be retrieved.
     * @return An Optional object containing the requested Player object if found, or empty if not found.
     */
    @GetMapping("/{id}")
    public Optional<Player> getPlayersById(@PathVariable Long id) {
        return playerService.getPlayerById(id);
    }

    /**
     * Updates an existing player based on its identifier and provided PlayerDto object.
     *
     * @param id       The unique identifier (Long) of the player to be updated.
     * @param playerDto  The PlayerDto object containing updated information for the player.
     * @return The updated Player object after the update operation.
     * @throws Exception Throws an exception if an error occurs during player update.
     */
    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody PlayerDto playerDto) {
        return playerService.updatePlayer(id, playerDto);
    }

    /**
     * Deletes a player from the database based on its unique identifier.
     *
     * @param id The unique identifier (Long) of the player to be deleted.
     * @return A ResponseEntity object with appropriate HTTP status code and message.
     *         - On success: 200 OK with a success message indicating the deleted player's ID.
     *         - On failure: Appropriate error code (e.g., 404 Not Found) with an error message.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlayer (@PathVariable Long id) {
        return playerService.deletePlayer(id);
    }
}
