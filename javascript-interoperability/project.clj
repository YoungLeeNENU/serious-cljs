(defproject figwheel-project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :url "http://example.com/FIXME"
  
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.51"]]

  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-figwheel "0.5.1"]]

  :clean-targets [:target-path "out"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel true
              :compiler {:main "javascript-interoperability.core"
                         :asset-path "js/out"
                         :output-to "resources/public/js/main.js"
                         :output-dir "resources/public/js/out"}}]})

