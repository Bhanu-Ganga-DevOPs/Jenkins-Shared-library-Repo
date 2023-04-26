def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn clean package sonar:sonar'
    }
}




//squ_bb14ecf6f1f7bd0379bae704fbcfee88e5f0b25f
