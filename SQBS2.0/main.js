const electron = require('electron');
const {app, BrowserWindow, Menu} = require('electron');
const ipc = electron.ipcMain;
let win, colorWin;
function createWindow() {
    win = new BrowserWindow ({
        width: 1280,
        height: 720,
        webPreferences: {
            nodeIntegration: true
        }
    })
    win.setResizable(true);
    win.loadFile('index.html');
    ipc.on('new-tournament', function(event) {
      win.loadFile('windows/new_tournament.html');
    })

    ipc.on('open-tutorials', function(event) {
      win.loadFile('windows/tutorials.html');
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

