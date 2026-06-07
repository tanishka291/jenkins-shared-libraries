def call(String ProjectName, String ImageTag, String dockerhubUser){
  sh "docker build -t ${dockerhubUser}/${ProjectName}:${ImageTag} ."
}
