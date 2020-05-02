(ns example.main
  ;; Map CLJSJS React packages, then run core ns
  (:require cljsjs.react
            cljsjs.react.dom
            example.core))

(defn ^:dev/after-load mount []
  (example.core/mount))

(defn ^:export init []
  (mount))
