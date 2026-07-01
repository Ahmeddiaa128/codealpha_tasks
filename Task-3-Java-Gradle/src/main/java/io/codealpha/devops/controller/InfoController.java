package io.codealpha.devops.controller;

import io.codealpha.devops.model.ApplicationInfo;
import io.codealpha.devops.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private final ApplicationService applicationService;

    public InfoController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/api/info")
    public ApplicationInfo getApplicationInfo() {
        return applicationService.getApplicationInfo();
    }
}

