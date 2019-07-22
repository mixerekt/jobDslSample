def repo = 'mixerekt/jobDslSample'
def baseFolder = 'OneExample'

folder(baseFolder) {
  discription = 'Example job'
}

job("$baseFolder/example") {
  steps {
    echo "hello form $repo"
  }
}
