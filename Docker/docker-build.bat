cd ..
docker build -t info-app -f Docker/Dockerfile . > docker-build.log
docker images