theme: /calling
    
            
    state: Calling
        q!: (алло/здравствуйте/слушаю/да)
        script:
            function getRandomInt(min, max) {
                var min = Math.ceil(min);
                var max = Math.floor(max);
                var randNumb = Math.floor(Math.random() * (max - min)) + min;
            return randNumb; //Максимум не включается, минимум включается
            };
            var link = audios[getRandomInt(0, Object.keys(audios).length)].link
            return $reactions.audio(link);
