Hexel
=====

A voxel based exploration game

goals:
-----

* use cellular automata to create a dynamic and unpredictable environment
* implement a world generator that creates highly appealing terrain
* allow players to, if they desire, always move towards increasingly dangerous situations

install with maven
-----
The project is now mavenised. To run using maven use:
	 
	 MAVEN_OPTS=-Xmx1024m mvn install exec:java -Dexec.mainClass="Hexel.Hexel"

To prepare the project as an eclipse project try:

	mvn install eclipse:eclipse
	
you may also have to make eclipse aware of your maven classpath

        http://www.mkyong.com/maven/how-to-configure-m2_repo-variable-in-eclipse-ide/

This should make the game more likely to "work out of the box"

playing the game:
-----

* download the appropriate file from [here](http://ge.tt/9E4Sl7x)
* **DISCLAIMER**: This may or may not work on your computer
* It will take a while to load, a good minute or two even on fast computers
* make sure you look at the config to see the controls
* you have to click v to toggle mouse lock

contributing:
-----

* See the issues page if you have any ideas or want to see what we're thinking

1. fork the repository
2. make a new git branch
3. see the 'install with maven' section
4. import into eclipse
5. write code
6. make commit
7. submit pull request!

screenshots:
-----

![](http://imgur.com/6GCARMM.png)

![](http://imgur.com/1rpb5k2.png)

![](http://i.imgur.com/8JZRciQ.jpg)
