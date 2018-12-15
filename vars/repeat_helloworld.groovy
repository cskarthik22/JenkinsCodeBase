def call(int count, String mesg){

  echo 'Jenkins Shared Library - Repeat Hello world'
  for (int i=0; i< count; i++) {
      echo  mesg + ' : ' + (i+1)
  }
    

}