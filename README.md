# Booking.com Clone

## Description
Booking.com Clone is a project demonstrating skills in web development and DevOps, specifically focusing on building a simplified version of the Booking.com platform. It utilizes Spring Boot for backend development, PostgreSQL for data persistence, and Docker for containerization to facilitate easy deployment and scaling.

## Features
- **User Authentication:** Secure user registration and login.
- **Accommodation Listings:** List various accommodations available for booking.
- **Search and Filtering:** Search for accommodations based on location, date, and other criteria.
- **Booking Management:** Enable users to book accommodations and manage their bookings.
- **Admin Dashboard:** Admin panel for managing accommodations, users, and bookings.
- **DevOps Focus:**
  - **Docker Containerization:** Use Docker to containerize the application components.
  - **Docker Compose:** Define and manage multi-container Docker applications with Docker Compose.
  - **PostgreSQL Integration:** Store application data in a PostgreSQL database.
  
## Technologies Used
- Spring Boot
- PostgreSQL
- Docker
- Docker Compose

## Installation Instructions
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/booking.com-clone.git
   cd booking.com-clone



# Commands

## Updating packages
```
sudo apt-get update
```

## Installing docker on Ubuntu
```
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo apt-get install docker-ce docker-ce-cli containerd.io
apt-cache madison docker-ce
sudo apt install docker.io
```

## Installling docker-compose on Ubuntu and configuring permissions
```
sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
```

## Building image for our project
```
sudo docker build -t banurr/midterm .
```

## Docker login
```
sudo docker login
```

## Push it to the Dockerhub repo
```
sudo docker push banurr/midterm
```

## Build or pull necessary images and run all containers of docker-compose in detached way
```
sudo docker compose up -d
```
