def call(String ProjectName, String ImageTag, String DockerHubUer){
  sh "docker build -t ${DockerHubUer}/${ProjectName}:${ImageTag} ."
}
