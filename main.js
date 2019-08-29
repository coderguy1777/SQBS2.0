const electron = require('electron');
const {app, BrowserWindow, Menu} = require('electron');
const ipc = electron.ipcMain;
let win, colorWin;
function createWindow() {
    win = new BrowserWindow ({
        width: 1280,
        height: 720,
        webPreferences: {
            nodeIntegration: true,
            setResizable: true
        }
    })
    win.setResizable(true);
    win.loadFile('index.html');
    ipc.on('new-tournament', function(event) {
      win.loadFile('windows/new_tournament.html');
    })

    ipc.on('previous-tournament', function(event) {
      win.loadFile('windows/previous-tournament.html');
    })

    ipc.on('open-tutorials', function(event) {
      win.loadFile('windows/tutorials.html');
    })

    ipc.on('new-bracket', function(event) {
      win.loadFile('windows/new-bracket.html');   
    })

    ipc.on('previous-bracket', function(event) {
      win.loadFile('windows/previous-bracket.html');
    })
}

app.on('ready', createWindow);
app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') {
      app.quit()
    }
  })
  
  app.on('activate', () => {
    if (win === null) {
      createWindow()
    }
  })

