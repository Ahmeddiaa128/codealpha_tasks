package io.codealpha.devops.model;

public class SystemInfo {

    private String operatingSystem;
    private String osVersion;
    private String javaVersion;
    private String user;
    private String architecture;
    private int availableProcessors;

    public SystemInfo(String operatingSystem,
                      String osVersion,
                      String javaVersion,
                      String user,
                      String architecture,
                      int availableProcessors) {

        this.operatingSystem = operatingSystem;
        this.osVersion = osVersion;
        this.javaVersion = javaVersion;
        this.user = user;
        this.architecture = architecture;
        this.availableProcessors = availableProcessors;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getUser() {
        return user;
    }

    public String getArchitecture() {
        return architecture;
    }

    public int getAvailableProcessors() {
        return availableProcessors;
    }
}
