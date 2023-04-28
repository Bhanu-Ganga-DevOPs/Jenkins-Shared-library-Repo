
 def call(String ImageName, String ImageTag, String DockerHubUser){
    
     sh """
      docker image build -t ${DockerHubUser}/${ImageName} . 
      docker image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:${ImageTag}
      docker image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:latest
    """
}


