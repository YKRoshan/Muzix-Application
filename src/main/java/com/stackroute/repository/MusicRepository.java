package com.stackroute.repository;


import com.stackroute.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music,Integer> {

    @Query("SELECT m FROM Music m WHERE m.trackName =?1")
    public List<Music> findByTrackName(String name);
}
