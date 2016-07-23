(ns javascript-interoperability.core)

(enable-console-print!)


(let [js-var-a (array 1 2 3)
      cljs-symbol-b [1 2 3]]

  (defn show-dom-msg [judge]
    "Show Message on Page"
    (if (= judge true)
      (set! (.-innerHTML (js/document.getElementById "msg-container")) ;js object 里属性的使用
            "Same Data")
      (set! (.-innerHTML (js/document.getElementById "msg-container"))
            "Different Data")))
  (do
    ;; 和 js 变量互相转换
    ;; (.log js/console (type js-var-a))
    (println (type js-var-a))
    ;; (.log js/console (type cljs-symbol-b))
    (println (type cljs-symbol-b))
    ;; (.log js/console (type (js->clj js-var-a)))
    (println (type (js->clj js-var-a)))
    ;; (.log js/console (type (clj->js cljs-symbol-b)))
    (println (type (clj->js cljs-symbol-b)))

    ;; 不可变数据
    #_(if (= js-var-a (array 1 2 3))
        (show-dom-msg true)
        (show-dom-msg false))
    #_(if (= cljs-symbol-b [1 2 3])
        (show-dom-msg true)
        (show-dom-msg false))
    #_(if (= (js->clj js-var-a) [1 2 3])
        (show-dom-msg true)
        (show-dom-msg false))
    #_(if (= (clj->js cljs-symbol-b) (array 1 2 3))
        (show-dom-msg true)
        (show-dom-msg false))
    ))
