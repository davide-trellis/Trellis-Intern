/*

Starting with a path e.g.

"C:\Users\desposito\Documents\virtual_box\vm-mnt-grape\git\hello-world\trellis\database\bundle\t"

Walk down into all folders in that path and in each folder find the .plb files. When you find one, 
delete any other file with the same name but not a .plb.

See: 

http://www.groovy-lang.org/documentation.html
specifically:
http://www.groovy-lang.org/groovy-dev-kit.html

class library for java: 
https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/package-summary.html

*/

f = new File(/C:\Users\desposito\Documents\virtual_box\vm-mnt-grape\git\hello-world\trellis\database\bundle\t/)

f.class

g = new File(/C:\Users\desposito\Documents\virtual_box\vm-mnt-grape\git\hello-world\trellis\database\bundle\t\07\07.00\07.00.00\07.00.00.001/)


g.eachFile { file ->                      
    println file.name
}

