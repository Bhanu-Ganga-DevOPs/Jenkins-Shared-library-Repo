def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn clean package sonar:sonar'
    }
}




//squ_d7dc3e329a073434310be8ec26cff486fcba72e6
