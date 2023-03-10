package com.nbaliga.services;

import com.nbaliga.dto.TeamDTO;
import com.nbaliga.dto.TeamRankingsDTO;
import com.nbaliga.entities.Team;
import com.nbaliga.repositories.TeamRepository;
import com.nbaliga.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional(readOnly = true)
    public TeamDTO findById(Long id) {
        Optional<Team> obj = teamRepository.findById(id);
        Team entity = obj.orElseThrow(() -> new ResourceNotFoundException("Time não encontrado"));
        return new TeamDTO(entity, entity.getPlayers(), entity.getPicks());
    }

    @Transactional(readOnly = true)
    public List<TeamDTO> findAll() {
        List<Team> list = teamRepository.listAll();
        return list.stream().map(team -> new TeamDTO(team)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TeamRankingsDTO> findRanking() {
        List<Team> list = teamRepository.listAll();
        return list.stream().map(team -> new TeamRankingsDTO(team)).collect(Collectors.toList());
    }
}
