#/usr/bin/sh

# This script downloads the latest version of mason and its listed dependencies,
# and places them in the lib directory. I've never been very clear on 
# licensing issues, so I hope I'm not in violation (and I hope I'm not stepping
# on anyone's toes.) If I am, please let me know.
#
# // John B Nelson

# Make and move into the lib directory.
mkdir lib; cd $_

# Get MASON jar files; extract them to the lib directory.
wget http://cs.gmu.edu/~eclab/projects/mason/mason.tar.gz
tar -xzf mason.tar.gz
mv mason/jar/*.jar ./
rm -rf mason mason.tar.gz

# Get the jar files for MASON dependencies; extract them to the lib directory.
wget http://cs.gmu.edu/~eclab/projects/mason/libraries.tar.gz
tar -xzf libraries.tar.gz
mv libraries/*.jar ./
rm -rf libraries libraries.tar.gz

