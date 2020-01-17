# spring-boot-basic-customer


#### Creating the docker image

  - docker image build . -t basic-customer
  
#### Creating the docker container
  
  - docker container create --name basic-customer-container basic-customer

#### Running the docker container

  - docker container run -d --name "basic-customer-container" -p 8080:8080 basic-customer