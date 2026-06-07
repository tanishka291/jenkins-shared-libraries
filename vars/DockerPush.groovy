def call(String ProjectName, String ImageTag, String dockerhubUser) {
    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "dockerhubUser",
        passwordVariable: "dockerhubPass"
    )]) {
        sh """
            docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}
            docker push ${env.dockerhubUser}/${ProjectName}:${ImageTag}
        """
    }
}
