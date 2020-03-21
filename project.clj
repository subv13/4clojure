(defproject fourclojure "1.0"
  :description "4clojure"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot fourclojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
