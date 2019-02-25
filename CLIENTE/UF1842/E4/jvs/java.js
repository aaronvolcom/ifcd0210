// JavaScript Document

 var holding = false;
var track = document.getElementById('track');
var progress = document.getElementById('progress');
var play = document.getElementById('play');
var next = document.getElementById('next');
var prev = document.getElementById('prev');
var title = document.getElementById('title');
var artist = document.getElementById('artist');
var art = document.getElementById('art');
var current_track = 0;
var song, audio, duration;
var playing = false;
var songs = [{
    title: 'Judith',
    artist: 'A Perfect Circle',
    url: 'https://p0.soundike.com/atsZc09X3LFXV3nNnEXQEQ/1550885127/4494885.mp3',
    art: 'https://is1-ssl.mzstatic.com/image/thumb/Music118/v4/5d/9b/24/5d9b24c2-20d9-c047-b314-d61b27295e69/00724384925352.rgb.jpg/600x600bf.png'
},
    
{
    title: 'Duality',
    artist: 'Slipknot',
    url: 'https://p0.soundike.com/HLyj9b6H4AE9DBLg5XQ0QQ/1550885565/2873172.mp3',
    art: 'https://is4-ssl.mzstatic.com/image/thumb/Music3/v4/f7/30/64/f730648e-d587-5744-37c9-b51b396932bb/016861752347.jpg/600x600bf.png'
},

{
    title: '666',
    artist: 'Slaughter To Prevail',
    url: 'https://p3.soundike.com/2O2veWwT85QDb8J3i-jNUw/1550885871/6387255.mp3',
    art: 'https://images-eu.ssl-images-amazon.com/images/I/51ac6%2BDCyGL._SS500.jpg'
},

{
    title: 'Psychopathic Engorgement',
    artist: 'Lacerate Thy Maker',
    url: 'https://p0.soundike.com/WW8MhPQo81pdfI5CARDOlg/1550887084/5983161.mp3',
    art: 'https://images-eu.ssl-images-amazon.com/images/I/61mk4arHG0L._SS500.jpg'
},

{
    title: 'The Path',
    artist: 'Brutallity Will Prevail',
    url: 'https://p0.soundike.com/SlXqCFa9V0DOudnAZP0qag/1550887302/4242368.mp3',
    art: 'http://www.rocksound.tv/assets/uploads/bwpalbumcover.jpg'
},
			 
{
    title: 'DeadGringer',
    artist: 'Knocked Loose',
    url: 'https://p0.soundike.com/N91Idl7P6J3Jy2OOA-2slw/1550887382/6159349.mp3',
    art: 'https://t2.genius.com/unsafe/300x300/https%3A%2F%2Fimages.genius.com%2Fdbb6989c97e0b75be7abb46c818a1f91.960x960x1.jpg'
}];

window.addEventListener('load', init(), false);

function init() {
    song = songs[current_track];
    audio = new Audio();
    audio.src = song.url;
    title.textContent = song.title;
    artist.textContent = song.artist;
    art.src = song.art;
}


audio.addEventListener('timeupdate', updateTrack, false);
audio.addEventListener('loadedmetadata', function () {
    duration = this.duration;
}, false);
window.onmousemove = function (e) {
    e.preventDefault();
    if (holding) seekTrack(e);
}
window.onmouseup = function (e) {
    holding = false;
    console.log(holding);
}
track.onmousedown = function (e) {
    holding = true;
    seekTrack(e);
    console.log(holding);
}
play.onclick = function () {
    playing ? audio.pause() : audio.play();
}
audio.addEventListener("pause", function () {
    play.innerHTML = '<img class="pad" src="img/play.png" />';
    playing = false;
}, false);

audio.addEventListener("playing", function () {
    play.innerHTML = '<img src="img/pause.png" />';
    playing = true;
}, false);
next.addEventListener("click", nextTrack, false);
prev.addEventListener("click", prevTrack, false);


function updateTrack() {
    curtime = audio.currentTime;
    percent = Math.round((curtime * 100) / duration);
    progress.style.width = percent + '%';
    handler.style.left = percent + '%';
}

function seekTrack(e) {
    event = e || window.event;
    var x = e.pageX - player.offsetLeft - track.offsetLeft;
    percent = Math.round((x * 100) / track.offsetWidth);
    if (percent > 100) percent = 100;
    if (percent < 0) percent = 0;
    progress.style.width = percent + '%';
    handler.style.left = percent + '%';
    audio.play();
    audio.currentTime = (percent * duration) / 100
}
function nextTrack() {
    current_track++;
    current_track = current_track % (songs.length);
    song = songs[current_track];
    audio.src = song.url;
    audio.onloadeddata = function() {
      updateInfo();
    }
}

function prevTrack() {
    current_track--;
    current_track = (current_track == -1 ? (songs.length - 1) : current_track);
    song = songs[current_track];
    audio.src = song.url;
    audio.onloadeddata = function() {
      updateInfo();
    }
}

function updateInfo() {
    title.textContent = song.title;
    artist.textContent = song.artist;
    art.src = song.art;
    art.onload = function() {
        audio.play();
    }
}