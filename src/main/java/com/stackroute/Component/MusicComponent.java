package com.stackroute.Component;

import com.stackroute.domain.Music;
import com.stackroute.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

public class MusicComponent implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
/*
    private MusicRepository musicRepository;

    @Autowired
    public MusicComponent(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Music music = new Music(1,"Yash","salam");
        musicRepository.save(music);
    }*/


}
