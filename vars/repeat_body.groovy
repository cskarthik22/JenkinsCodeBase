def call(int count, Closure body){
    for ( int i=0; i<count; i++){
        body()
    }
}