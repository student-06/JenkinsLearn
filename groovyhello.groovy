

def command = ("git ls-remote -h -t https://student-06:siddharth6@github.com/student-06/JenkinsLearn.git")
def process = command.execute ( )

def x = process.text.readLines()
			.collect { it.split()[1].replaceAll('refs/heads/', '')  }
			.unique().sort()


println ("hoho")
println (x.getClass())

// return ['master', 'pnr-49007345']
