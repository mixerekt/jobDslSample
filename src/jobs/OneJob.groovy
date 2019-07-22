def repo = 'mixerekt/jobDslSample'
def baseFolder = 'OneExample'

folder(baseFolder) {
  discription = 'Example job'
}

job() {
  steps {
    echo "hello form $repo"
  }
}
