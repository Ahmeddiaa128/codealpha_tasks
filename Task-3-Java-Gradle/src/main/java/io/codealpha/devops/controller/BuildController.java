package io.codealpha.devops.controller;

import io.codealpha.devops.model.BuildInfo;
import io.codealpha.devops.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildController {

    private final ApplicationService applicationService;

    public BuildController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/api/build")
    public BuildInfo getBuildInfo() {
        return applicationService.getBuildInfo();
    }
}
