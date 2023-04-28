 def call(String project, String ImageTag, String hubUser){
     withCredentials([usernamePassword(
             credentialsId: "docker",
             usernameVariable: "USER",
             passwordVariable: "PASS"
     )]) {
         sh "docker login -u '$USER' -p '$PASS'"
     }
     sh "docker image push ${hubUser}/${project}:${ImageTag}"
     sh "docker image push ${hubUser}/${project}:latest"
 }

 //squ_1c8f4d8e04b2ae505590ab1945327d5054c3eba0



	
	
	

  
//   aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 555138969324.dkr.ecr.us-east-1.amazonaws.com  