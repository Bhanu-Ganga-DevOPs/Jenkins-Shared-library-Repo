// def call(String project, String ImageTag, String hubUser){
    
//    withCredentials([usernamePassword(
//     credentialsId: 'docker', 
//     passwordVariable: 'PASS', 
//     usernameVariable: 'USER'
//     )]) {
        
//         sh "docker login -u '$USER' -p '$PASS'"
//     }

//     sh "docker image push ${hubUser}/${project}:${ImageTag}"
//     sh "docker image push ${hubUser}/${project}:latest"
// }


def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     
     aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 555138969324.dkr.ecr.us-east-1.amazonaws.com
     docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}

// aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com