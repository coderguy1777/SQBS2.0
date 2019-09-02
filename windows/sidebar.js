const nav_id = document.getElementById("stat-nav-bar");
const btn_id = document.getElementById("nav-show-btn");
const sidebar_ic_11 = document.getElementById("sidebar_ic_1");

function nav_btn_clicked() {
    nav_id.classList.remove("inactive");
    nav_id.classList.toggle("active");
}

function nav_btn_released() {
    nav_id.classList.remove("active");
    nav_id.classList.toggle("inactive");
}

function nav_active_side_ic() {
    sidebar_ic_11.classList.remove("sidebar-icon.isoff");
    sidebar_ic_11.classList.toggle("sidebar-icon.ison");
}

function nav_inactive_side_ic() {
    sidebar_ic_11.classList.remove("sidebar-icon.ison");
    sidebar_ic_11.classList.toggle("sidebar-icon.isoff");
}


btn_id.addEventListener('click', () => {
    nav_btn_clicked();
    nav_active_side_ic();
});

btn_id.addEventListener('mouserelease', () => {
    nav_btn_released();
    nav_inactive_side_ic();
});