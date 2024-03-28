package com.tolux.resumeapplicationwar.Service;



import com.tolux.resumeapplicationwar.Model.ApplicationInfo;

import java.util.List;

public interface ApplicationServiceInterface {

    public String registerApplication(ApplicationInfo applicationInfo);
    public ApplicationInfo fetchApplicationsById(Integer id);
    public List<ApplicationInfo>  fetchAllApplication();

    public String deleteApplicationById(Integer id);
}
