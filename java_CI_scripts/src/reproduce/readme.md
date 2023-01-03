# Run fiji script from this directory
````
~/Fiji.app/ImageJ-linux --headless --console --ij2 --run .\test_many_with_deepimagej.clj
````

`test_many_with_deepimagej.clj` will be run from fiji.
- It will run DeepImageJ over many models 
- It is in this directory for convenient editing and testing with
  IntelliJ/Cursive
- It has only available the libraries that come with Fiji (e.g clojure 1.8)
- All babashka libraries will not be available