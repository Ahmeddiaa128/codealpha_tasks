# 🚀 Task 2 - Jenkins Remoting

This project demonstrates **Jenkins Remoting** using two different infrastructure approaches. Both implementations achieve the same goal—executing Jenkins pipelines on remote agents—but with different deployment models.

## 📂 Implementations

### 🖥️ Vagrant-Based Infrastructure

A traditional virtual machine setup using **Vagrant** and **VirtualBox**.

**Highlights**
- Jenkins Controller on Ubuntu VM
- Dedicated Jenkins Agent VM
- SSH-based Remoting
- Declarative Pipeline
- Automated provisioning with Vagrant

📁 Location: `vagrant/`

---

### ☸️ Kubernetes-Based Infrastructure

A containerized Jenkins environment orchestrated with **Kubernetes**, where the controller and multiple agent pods work together to execute CI/CD pipelines.

**Highlights**
- Jenkins Controller Deployment
- Multiple Jenkins Agent Pods
- Kubernetes Deployments & Services
- Persistent Storage
- Docker Images
- Declarative Pipeline
- Scalable Agent Architecture

📁 Location: `jenkins-on-kubernetes/`

---

## 📁 Project Structure

```text
Task-2-Jenkins-Remoting/
│
├── README.md
├── vagrant/
│   ├── README.md
│   ├── Vagrantfile
│   ├── Jenkinsfile
│   └── ...
│
└── jenkins-on-kubernetes/
    ├── README.md
    ├── docker/
    ├── manifests/
    ├── Jenkinsfile
    └── ...
```

## 🎯 Objective

The purpose of this task is to demonstrate how Jenkins Remoting can be implemented using different infrastructure technologies while maintaining the same CI/CD workflow and automation principles.

## 👨‍💻 Author

**Ahmed Diaa Hassan**
