 def call(String ImageName, String ImageTag, String DockerHubUser){
    
     sh """
      
      docker rmi  ${DockerHubUser}/${ImageName}:${ImageTag}
     docker rmi  ${DockerHubUser}/${ImageName}:latest
    """
 }


//def call(String aws_account_id, String region, String ecr_repoName){
//
//    sh """
//     docker rmi ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//    """
// }
