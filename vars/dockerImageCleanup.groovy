 def call(String ImageName, String ImageTag, String DockerHubUser){
    
     sh """
      
      docker rmi  ${DockerHubUser}/${ImageName}:${ImageTag}
     docker rmi  ${DockerHubUser}/${ImageName}:latest
    """
 }


