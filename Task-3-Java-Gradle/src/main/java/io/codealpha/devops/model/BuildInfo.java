package io.codealpha.devops.model;

public class BuildInfo {

    private String applicationName;
    private String applicationVersion;
    private String springBootVersion;
    private String javaVersion;
    private String buildTool;

    public BuildInfo(String applicationName,
                     String applicationVersion,
                     String springBootVersion,
                     String javaVersion,
                     String buildTool) {

        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
        this.springBootVersion = springBootVersion;
        this.javaVersion = javaVersion;
        this.buildTool = buildTool;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public String getSpringBootVersion() {
        return springBootVersion;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getBuildTool() {
        return buildTool;
    }
}
