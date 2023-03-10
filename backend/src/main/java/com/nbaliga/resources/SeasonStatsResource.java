package com.nbaliga.resources;

import com.nbaliga.dto.SeasonStatsDTO;
import com.nbaliga.services.SeasonStatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/stats")
public class SeasonStatsResource {

    private final SeasonStatsService seasonStatsService;

    public SeasonStatsResource(SeasonStatsService seasonStatsService) {
        this.seasonStatsService = seasonStatsService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<SeasonStatsDTO>> findStatsById(@PathVariable Long id) {
        List<SeasonStatsDTO> stats = seasonStatsService.findStatsById(id);
        return ResponseEntity.ok().body(stats);
    }
    @GetMapping(value = "/season/{season}")
    public ResponseEntity<List<SeasonStatsDTO>> findAll(@PathVariable Integer season) {
        List<SeasonStatsDTO> stats = seasonStatsService.findAll(season);
        return ResponseEntity.ok().body(stats);
    }

}