(ns fourclojure.core (:gen-class))

(defn hello 
  ([] (println "Hello world"))
  ([name] (println (str "Hello, " name))))

(hello "Lena")