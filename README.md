# Nebula

### Project to-dos

#### Technology selection and testing - tech selection, docker
- Determine a database technology to use
- Create schema through migrations if necessary
- Create DAOs to perform operations with chosen technology
- Write integration tests for DAOs that run a docker container for chosen database

#### Building and deploying - docker, build tools
- Find way to generate JAR for individual services
  - JAR file should contain all necessary dependencies, runnable with `java -jar file.jar`  
- Add gradle plugin to build dockerfile for service, runs JAR file
- Maybe have gradle commands that build container from dockerfile and push to configured docker container repository

#### Local orchestration - docker-compose/kubernetes, build tools
- Find way to get all services running locally (may require shell script and custom config)

#### Infrastructure - terraform, cloud infrastructure, deployment
- Select cloud infrastructure provider (ideally with a free tier)
- Create necessary resources on cloud infrastructure with terraform
- Manually deploy resources to cloud through upload/copying/registry

#### Continuous delivery
- Select build pipeline provider (ideally with a free tier)
- Create pipeline to deploy to cloud infrastructure
- Integrate with GitHub

#### Extensions
- Load testing
- Caching to improve performance
- Smoke testing
- Basic UI
