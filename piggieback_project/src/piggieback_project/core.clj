(ns piggieback-project.core
  ;; (:require [clojure.browser.repl :as repl])
  (:require [weasel.repl :as repl]))

(when-not (repl/alive?)
  (repl/connect "ws://localhost:9001"))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(.write js/document
        "<p>Hello World!</p>")

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
