let nav_cont = document.getElementById("stat-nav-bar");
let nav_show_btn = document.getElementById("nav-show-btn");
nav_show_btn.addEventListener('click', function() {
    navisActive();
});

nav_show_btn.addEventListener('mouserelease', function() {
    navnotActive();
});

function navisActive() {
    nav_cont.classList.remove("inactive");
    nav_cont.classList.toggle("active");
}

function navnotActive() {
    nav_cont.classList.remove("active");
    nav_cont.classList.toggle("inactive");
}