package io.codealpha.devops.controller;

import io.codealpha.devops.model.SystemInfo;
import io.codealpha.devops.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    private final ApplicationService applicationService;

    public SystemController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/api/system")
    public SystemInfo systemInfo() {
        return applicationService.getSystemInfo();
    }
}
