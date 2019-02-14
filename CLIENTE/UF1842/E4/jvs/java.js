// JavaScript Document

 var figure = $(".video");
        var vid = $("video");

        [].forEach.call(figure, function (item) {
                item.addEventListener('mouseover', hoverVideo, false);
                item.addEventListener('mouseout', hideVideo, false);
        });
        
        function hoverVideo(e) {  
                $('.thevideo')[0].play(); 
        }

        function hideVideo(e) {
                $('.thevideo')[0].pause(); 
        }