export interface PlayoffStats {
  season: number;
  id: number;
  minutes: number;
  league: number;
  team: string;
  games: number;
  fga: number;
  fgm: number;
  threePa: number;
  threePm: number;
  fta: number;
  ftm: number;
  offensiveRebounds: number;
  rebounds: number;
  assists: number;
  steals: number;
  blocks: number;
  turnovers: number;
  points: number;
  fouls: number;
  plusMinus: number;
  dq: number;
  doubleDoubles: number;
  tripleDoubles: number;
  fgPct: number;
  mpg: number;
  ppg: number;
  spg: number;
  bpg: number;
  rpg: number;
  apg: number;
  threePct: number;
  orebsPg: number;
  drebsPg: number;
  ftpct: number;
  threePAPg: number;
  drpg: number;
  threePMPg: number;
  fgmpg: number;
  plusMinusPg: number;
  fgapg: number;
  orpg: number;
  pfouPg: number;
  topg: number;
  ftapg: number;
  ftmpg: number;
  playerName: string;
  playerPosition: number;
}
