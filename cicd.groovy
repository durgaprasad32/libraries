def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/$(repo)"
}
def newbuild()
{ 
  sh 'mvn pacakge'
}  
