;; Namespace
(ns hello-world.core               ;replace the underscore with dashes
  (:require [clojure.browser.repl :as repl]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

;; Browser alert
(js/alert "Hello World, Using Browser REPL...")
