package com.nbaliga.resources;


import com.nbaliga.dto.TeamDTO;
import com.nbaliga.dto.TeamRankingsDTO;
import com.nbaliga.services.TeamService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = "/teams")

public class TeamResource {
    private final TeamService teamService;

    public TeamResource(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TeamDTO> findById(@PathVariable long id) throws Exception {
        TeamDTO dto = teamService.findById(id);
        return ResponseEntity.ok().body(dto);
    }
    @GetMapping
    public ResponseEntity<List<TeamDTO>> findAll() {
        List<TeamDTO> list = teamService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "rankings")
    public ResponseEntity<List<TeamRankingsDTO>> findRanking() {
        List<TeamRankingsDTO> list = teamService.findRanking();
        return ResponseEntity.ok().body(list);
    }

}
