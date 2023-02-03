package com.nbaliga.services;

import com.nbaliga.dto.ScheduleDTO;
import com.nbaliga.entities.Schedule;
import com.nbaliga.repositories.ScheduleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Transactional(readOnly = true)
    public List<ScheduleDTO> findAll() {
        List<Schedule> schedules = scheduleRepository.findAllSchedule();
        return schedules.stream().map(x -> new ScheduleDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<ScheduleDTO> findSchedulesByTeam(String team) {
        List<Schedule> schedules = scheduleRepository.findSchedulesByTeam(team);
        return schedules.stream().map(x -> new ScheduleDTO(x)).collect(Collectors.toList());
    }

}