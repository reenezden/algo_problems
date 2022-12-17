const HOME_TEAM_WON = 1

function tournamentWinner(competitions, results) {
  let currentBestTeam = '';
    const scores = {[currentBestTeam]: 0}
    
    for (let i = 0; i < competitions.length; i++) {
        const result = results[i];
        let [homeTeam, awayTeam] = competitions[i];
        
        const winningTeam = result === HOME_TEAM_WON ? homeTeam: awayTeam;
        
        updateScore(winningTeam, 3, scores)
        
        if (scores[winningTeam] > scores[currentBestTeam]) {
            currentBestTeam = winningTeam;  
        }
    }
  return currentBestTeam;
}

function updateScore(team, points, scores) {
    if (!(team in scores)) scores[team] = 0;
    scores[team] += points;
}

// O(n) time, where n is the number of matches
// O(k) space, where k is the number of teams


console.log(tournamentWinner(5, 6)) 