pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo "Building the application"

                sh './mvnw clean'

                echo "packaging the application"

                sh './mvnw package'
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========A executed successfully========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
        }
        stage("test"){
        steps{
            echo "Starting to test my application"

            sh './mvnw verify'
        }
        post{
            always{
                echo "====++++always++++===="
            }
            success{
                echo "====++++Testing went successfully++++===="
            }
            failure{
                echo "====++++Testing failed++++===="
            }
    
        }
    // }
    // post{
    //     always{
    //         echo "========always========"
    //     }
    //     success{
    //         echo "========pipeline executed successfully ========"
    //     }
    //     failure{
    //         echo "========pipeline execution failed========"
    //     }
     }
    }

    
}