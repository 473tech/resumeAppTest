package com.tolux.resumeapplicationwar.Dao;


import com.tolux.resumeapplicationwar.Model.ApplicationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepoDao extends JpaRepository<ApplicationInfo, Integer> {

}
