package com.tolux.resumeapplicationwar.Service;



import com.tolux.resumeapplicationwar.Dao.ApplicationRepoDao;
import com.tolux.resumeapplicationwar.Exception.ApplicationException;
import com.tolux.resumeapplicationwar.Model.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService  implements ApplicationServiceInterface{

    @Autowired
    private ApplicationRepoDao repo;

    @Override
    public String registerApplication(ApplicationInfo applicationInfo) {
        if(applicationInfo!=null){
            repo.save(applicationInfo);
            return "Application with "+applicationInfo.getCompanyName()+" stored to database";
        }
        else{
                throw new ApplicationException("Error saving application to database");
        }
    }

    @Override
    public ApplicationInfo fetchApplicationsById(Integer id) {
        Optional<ApplicationInfo> optional = repo.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new ApplicationException("Application with "+id+" not found");
        }
    }

    @Override
    public List<ApplicationInfo> fetchAllApplication() {
        List<ApplicationInfo> allApplications = repo.findAll();
        if(!allApplications.isEmpty() && allApplications.size()>0){
            return allApplications;
        }
        else{
            throw new ApplicationException("No applications available");
        }
    }

    @Override
    public String deleteApplicationById(Integer id) {
        Optional<ApplicationInfo> optional = repo.findById(id);
        if(optional.isPresent()){
            repo.deleteById(id);
            return "Application with id " + id + " deleted";
        }
        else{
            throw new ApplicationException("Application with " + id + " not found");
        }
    }


}
