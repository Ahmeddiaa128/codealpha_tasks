package io.codealpha.devops.model;

public class ApplicationInfo {

    private String application;
    private String intern;
    private String company;
    private String internship;
    private String task;
    private String framework;
    private String buildTool;
    private String javaVersion;
    private String status;

    public ApplicationInfo() {
    }

    public ApplicationInfo(String application,
                           String intern,
                           String company,
                           String internship,
                           String task,
                           String framework,
                           String buildTool,
                           String javaVersion,
                           String status) {

        this.application = application;
        this.intern = intern;
        this.company = company;
        this.internship = internship;
        this.task = task;
        this.framework = framework;
        this.buildTool = buildTool;
        this.javaVersion = javaVersion;
        this.status = status;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getIntern() {
        return intern;
    }

    public void setIntern(String intern) {
        this.intern = intern;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getInternship() {
        return internship;
    }

    public void setInternship(String internship) {
        this.internship = internship;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getBuildTool() {
        return buildTool;
    }

    public void setBuildTool(String buildTool) {
        this.buildTool = buildTool;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
