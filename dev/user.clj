(ns user
  (:require [figwheel.main.api :as figwheel]))

(def figwheel-build "dev")

(defn start []
  (figwheel/start {:mode :serve} figwheel-build)
  (figwheel/cljs-repl figwheel-build))
