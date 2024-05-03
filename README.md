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

## Push it to the Dockerhub repo
```
sudo docker push banurr/midterm
```

## Build or pull necessary images and run all containers of docker-compose in detached way
```
sudo docker compose up -d
```
