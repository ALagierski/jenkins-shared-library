void call(def image, String registryCredentials, String dockerRegistry) {
    docker.withRegistry( dockerRegistry, registryCredentials) {
        image.push()
        image.push('latest')
    }
}
