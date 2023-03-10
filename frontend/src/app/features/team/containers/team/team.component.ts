import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Schedule } from 'src/app/features/league/schedule/models/schedule';
import { ScheduleService } from 'src/app/features/league/schedule/services/schedule.service';

import { Team } from '../../models/team';
import { TeamRanking } from './../../models/teamRanking';
import { TeamService } from './../../services/team.service';

@Component({
  selector: 'team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.scss'],
})
export class TeamComponent implements OnInit {
  team!: Team;
  schedule!: Schedule[];
  rank!: TeamRanking[];

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private teamService: TeamService,
    private scheduleService: ScheduleService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.teamService.readOne(id).subscribe((team) => {
      this.team = team;
      this.getTeamSchedule();
      this.getTeamRank();
    });
  }

  getTeamSchedule() {
    if (this.team.name != null) {
      this.scheduleService.readOne(this.team.name).subscribe((schedule) => {
        this.schedule = schedule;
      });
    }
  }

  getTeamRank() {
    this.teamService
      .readRank()
      .subscribe((rank: TeamRanking[]) => (this.rank = rank));
  }

  reloadCurrentRoute() {
    const currentUrl = this.router.url;
    this.router.navigateByUrl('/', { skipLocationChange: true }).then(() => {
      this.router.navigate([currentUrl]);
    });
  }
}
