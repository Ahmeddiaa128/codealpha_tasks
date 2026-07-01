async function loadApplicationInfo() {

    const response = await fetch("/api/info");
    const data = await response.json();

    document.getElementById("application-info").innerHTML = `

        <div class="info-item"><strong>Application:</strong> ${data.application}</div>

        <div class="info-item"><strong>Intern:</strong> ${data.intern}</div>

        <div class="info-item"><strong>Company:</strong> ${data.company}</div>

        <div class="info-item"><strong>Internship:</strong> ${data.internship}</div>

        <div class="info-item"><strong>Task:</strong> ${data.task}</div>

        <div class="info-item"><strong>Framework:</strong> ${data.framework}</div>

        <div class="info-item"><strong>Build Tool:</strong> ${data.buildTool}</div>

        <div class="info-item"><strong>Java:</strong> ${data.javaVersion}</div>

        <div class="info-item">

            <strong>Status:</strong>

            <span class="badge bg-success">

                ${data.status}

            </span>

        </div>

    `;

}

async function loadSystemInfo() {

    const response = await fetch("/api/system");
    const data = await response.json();

    document.getElementById("system-info").innerHTML = `

        <div class="info-item"><strong>Operating System:</strong> ${data.operatingSystem}</div>

        <div class="info-item"><strong>OS Version:</strong> ${data.osVersion}</div>

        <div class="info-item"><strong>Java Version:</strong> ${data.javaVersion}</div>

        <div class="info-item"><strong>User:</strong> ${data.user}</div>

        <div class="info-item"><strong>Architecture:</strong> ${data.architecture}</div>

        <div class="info-item"><strong>CPU Cores:</strong> ${data.availableProcessors}</div>

    `;

}

// Build Information

document.getElementById("buildBtn").addEventListener("click", async () => {

    const response = await fetch("/api/build");

    const data = await response.json();

    document.getElementById("build-info").innerHTML = `

        <p><strong>Application:</strong> ${data.applicationName}</p>

        <p><strong>Version:</strong> ${data.version}</p>

        <p><strong>Build Time:</strong> ${data.buildTime}</p>

    `;

});



// Health Check

document.getElementById("healthBtn").addEventListener("click", async () => {

    const response = await fetch("/actuator/health");

    const data = await response.json();

    const badge =
        data.status === "UP"
            ? '<span class="badge bg-success">UP</span>'
            : '<span class="badge bg-danger">DOWN</span>';

    document.getElementById("health-info").innerHTML = `

        <h3>${badge}</h3>

    `;

});

loadApplicationInfo();
loadSystemInfo();
