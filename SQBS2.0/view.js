let electron = require('electron');
let ipc = electron.ipcRenderer;
const newTournament = document.getElementById("newGamebtn");
const SQBS2_0_tutorials = document.getElementById("tutorials");
const prevTournament = document.getElementById("prevGame");
const newBracket = document.getElementById("newBracket");
const prevBracket = document.getElementById("prevBracket");

newTournament.addEventListener('click', function() {
    ipc.send('new-tournament');
});

SQBS2_0_tutorials.addEventListener('click', function() {
    ipc.send('tutorials');
});

prevTournament.addEventListener('click', function() {
    ipc.send('previous-tournament');
});

newBracket.addEventListener('click', function() {
    ipc.send('new-bracket');
});

prevBracket.addEventListener('click', function() {
    ipc.send('previous-bracket');
});