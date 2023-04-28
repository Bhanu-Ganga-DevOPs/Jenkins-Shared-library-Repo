  def call(String ImageName, String ImageTag, String DockerHubUser){
    
     sh """

      trivy image ${DockerHubUser}/${ImageName}:latest > scan.txt
      cat scan.txt
     """
 }




