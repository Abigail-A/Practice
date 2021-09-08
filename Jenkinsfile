node {
  stage('SCM') {
    checkout scm
  }
    stage('Build') {
     bat "mvn -f C:/New_folder/I170Creator/pom.xml clean install" 
  }
  stage('SonarQube Analysis') {
    //def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      //sh "${mvn}/bin/mvn sonar:sonar"
      bat "mvn -f C:/New_folder/I170Creator/pom.xml sonar:sonar"
    }
  }
}
