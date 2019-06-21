const electron = require('electron');
const {app, BrowserWindow, Menu} = require('electron');

function createWindow() {
    let win = new BrowserWindow ({
        width: 1280,
        height: 720,
        webPreferences: {
            nodeIntegration: true
        }
    })
    win.setResizable(true);
    win.loadFile('index.html');
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

