import {
  BreakpointObserver,
  Breakpoints,
  BreakpointState,
} from '@angular/cdk/layout';
import { CommonModule } from '@angular/common';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { Router, RouterModule } from '@angular/router';
import { map, Observable } from 'rxjs';

import { SeasonInfo } from '../../models/seasonInfo';
import { SeasonInfoService } from '../../services/seasonInfo.service';
import { westData } from './westData';
import { eastData } from './eastData';
import { AuthService } from 'src/app/core/services/auth.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'sidenav',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    MatSidenavModule,
    MatListModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatMenuModule,
  ],
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.scss'],
})
export class SidenavComponent implements OnInit {
  @ViewChild('drawer') drawer: any;
  seasonInfo!: SeasonInfo[];
  eastNav = eastData;
  westNav = westData;
  imgLogo = 'assets/images/logos/';

  public isHandset$: Observable<boolean> = this.breakpointObserver
    .observe(Breakpoints.Handset)
    .pipe(map((result: BreakpointState) => result.matches));

  public isMenuOpen = true;

  constructor(
    private breakpointObserver: BreakpointObserver,
    private seasonInfoService: SeasonInfoService,
    private router: Router,
    private authService: AuthService,
    private toast: ToastrService
  ) {}

  ngOnInit(): void {
    this.isMenuOpen = true;
    this.getSeason();
  }

  getSeason() {
    this.seasonInfoService.read().subscribe((response) => {
      this.seasonInfo = response;
      const season = this.seasonInfo[0].season;
      const seasonDay = this.seasonInfo[0].seasonDay.toString();
      localStorage.setItem('season', season);
      localStorage.setItem('seasonDay', seasonDay);
    });
  }

  public isAuth() {
    return this.authService.isAuthenticated();
  }

  logout() {
    this.authService.logout();
    this.router.navigate(['login']);
    this.toast.info('Deslogado com sucesso!', 'Logout');
    window.location.reload();
  }

  get isHandset(): boolean {
    return this.breakpointObserver.isMatched(Breakpoints.Handset);
  }

  ngDoCheck() {
    if (this.isHandset) {
      this.isMenuOpen = false;
    } else {
      this.isMenuOpen = true;
    }
  }

  closeSideNav() {
    if (this.drawer._mode == 'over') {
      this.drawer.close();
    }
  }

  setMyStyles() {
    let styles = {
      width: '208px',
    };
    return styles;
  }
}
