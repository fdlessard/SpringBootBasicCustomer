# spring-boot-basic-customer


#### Endpoints

  - http://localhost:8080/customers/isAlive
  - http://localhost:8080/customers/1
  - http://localhost:8080/customers/

#### Creating the docker image

  - docker image build . -t basic-customer
  
#### Creating the docker container
  
  - docker container create --name basic-customer-container basic-customer

#### Running the docker container

  - docker container run -d --name "basic-customer-container" -p 8080:8080 basic-customer
  - docker inspect basic-customer
  - docker ps