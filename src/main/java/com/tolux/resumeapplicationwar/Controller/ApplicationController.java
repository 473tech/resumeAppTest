package com.tolux.resumeapplicationwar.Controller;


import com.tolux.resumeapplicationwar.Model.ApplicationInfo;
import com.tolux.resumeapplicationwar.Service.ApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Resume Application", description = "To perform operations on applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @Operation(summary = "Get operation", description = "Used to get Application by id")
    @GetMapping("/applications/{id}")
    public ApplicationInfo fetchApplicationsById(@PathVariable Integer id) {
        return applicationService.fetchApplicationsById(id);
    }

    @Operation(summary = "Get operation", description = "Used to get all Applications")
    @GetMapping("/getApplications")
    public List<ApplicationInfo> fetchAppAllApplications() {
        return applicationService.fetchAllApplication();
    }

    @Operation(summary = "POST operation", description = "Used to save Application info")
    @PostMapping("/postApplications")
    public String registerApplication(@RequestBody ApplicationInfo applicationInfo) {
        return applicationService.registerApplication(applicationInfo);
    }

    @Operation(summary = "Delete operation", description = "Used to delete Application info")
    @DeleteMapping("/applications/{id}")
    public String deleteApplicationById(@PathVariable Integer id) {
        return applicationService.deleteApplicationById(id);
    }

}
