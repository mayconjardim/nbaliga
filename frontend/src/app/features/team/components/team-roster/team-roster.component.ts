import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Player } from 'src/app/features/player/models/player';

import { Team } from '../../models/team';

@Component({
  selector: 'team-roster',
  templateUrl: './team-roster.component.html',
  styleUrls: ['./team-roster.component.scss'],
})
export class TeamRosterComponent implements OnInit {
  @Input() team!: Team;
  players!: Player[];

  imgLocation = 'assets/images/players/';
  separator = '_';

  constructor(private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {
    this.players = this.team.players;
  }

  getPlayerPic(firstName: string, lastName: string) {
    let imgLink = this.imgLocation + firstName + '_' + lastName + '.png';
    return {
      'background-image': 'url(' + imgLink + ')',
    };
  }

  getPosition(position: number) {
    switch (position) {
      case 5:
        return 'Point Guard';
      case 4:
        return 'Shooting Guard';
      case 3:
        return 'Small Forward';
      case 2:
        return 'Power Forward';
      default:
        return 'Center';
    }
  }

  ratingColors(rating: string) {
    switch (rating) {
      case 'A+':
        return 'assets/images/utils/aa.png';
      case 'A':
        return 'assets/images/utils/a.png';
      case 'B':
        return 'assets/images/utils/b.png';
      case 'C':
        return 'assets/images/utils/c.png';
      case 'D':
        return 'assets/images/utils/d.png';
      default:
        return 'assets/images/utils/f.png';
    }
  }

  getExp(xp: number) {
    if (xp == 0) {
      return 'Rookie';
    } else if (xp == 1) {
      return '2nd Season';
    } else if (xp == 2) {
      return '3rd Season';
    }
    return xp + 1 + 'th Season';
  }

  getHeight(height: any) {
    const ft = Math.floor(height / 12);
    const inc = height % 12;
    return ft + "'" + inc;
  }

  teamColors(team: string) {
    if (team == '76ers') {
      return 'Sixers';
    }
    return team;
  }

  reloadCurrentRoute() {
    const currentUrl = this.router.url;
    this.router.navigateByUrl('/', { skipLocationChange: true }).then(() => {
      this.router.navigate([currentUrl]);
    });
  }
}
