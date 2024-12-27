def DockerBuildImage(String image_name, String image_tag, String context) {
    sh "docker build -t ${image_name}:${image_tag}  ${context}"
}
