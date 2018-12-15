def call(int buildnumber) {

    if(buildnumber % 2 == 0) {
        pipeline {
            agent any
            stages {
                stage('testlog') {
                    steps {
                        echo 'Test groovy script custom log EVEN'
                        script {
                            log.info '****CUSTOM LOG****'
                        }  
                    }
                }
            }
        }
    } else {
        pipeline {
            agent any
            stages {
                stage('testlog') {
                    steps {
                        echo 'Test groovy script custom warning -ODD'
                        script {
                            log.warning '****CUSTOM WARNING****'
                        }  
                    }
                }
            }
        }

    }

}