(require 'cljs.build.api)               ; including the cljs api

(cljs.build.api/build "src" {:main 'hello-world.core
                             :output-to "out/main.js"
                             :optimizations :advanced}) ;build source file
