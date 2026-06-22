#!/bin/bash
set -e

echo "Updating packages..."
sudo apt update

echo "Installing Java..."
sudo apt install -y openjdk-17-jdk

echo "Installing Git..."
sudo apt install -y git

echo "Installing SSH Server..."
sudo apt install -y openssh-server

sudo systemctl enable ssh
sudo systemctl start ssh

echo "Jenkins Agent setup completed."