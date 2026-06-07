def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: "DockerHubCred",passwordVariable: "dockerhubPass",usernameVariable: "dockerhubUser")]) {
  sh "docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}"
}
   sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
