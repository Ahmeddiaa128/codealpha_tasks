package io.codealpha.devops.service;

import io.codealpha.devops.model.ApplicationInfo;
import io.codealpha.devops.model.SystemInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import io.codealpha.devops.model.BuildInfo;
import org.springframework.boot.SpringBootVersion;

@Service
public class ApplicationService {

    @Value("${application.title}")
    private String title;

    @Value("${application.author}")
    private String author;

    @Value("${application.company}")
    private String company;

    @Value("${application.internship}")
    private String internship;

    @Value("${application.task}")
    private String task;

    @Value("${application.framework}")
    private String framework;

    @Value("${application.buildTool}")
    private String buildTool;

    @Value("${application.version}")
    private String version;

    public ApplicationInfo getApplicationInfo() {

        return new ApplicationInfo(
                title,
                author,
                company,
                internship,
                task,
                framework,
                buildTool,
                System.getProperty("java.version"),
                "Running"
        );
    }

    public SystemInfo getSystemInfo() {

        return new SystemInfo(
                System.getProperty("os.name"),
                System.getProperty("os.version"),
                System.getProperty("java.version"),
                System.getProperty("user.name"),
                System.getProperty("os.arch"),
                Runtime.getRuntime().availableProcessors()
        );
    }

    public String getApplicationVersion() {
        return version;
    }

    public BuildInfo getBuildInfo() {

        return new BuildInfo(
                title,
                version,
                SpringBootVersion.getVersion(),
                System.getProperty("java.version"),
                buildTool
        );
    }
}
