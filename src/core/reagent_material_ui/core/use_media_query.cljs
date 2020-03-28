(ns reagent-material-ui.core.use-media-query
  "Imports @material-ui/core/useMediaQuery as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-media-query/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/useMediaQuery" :as useMediaQuery]))

(def use-media-query (wrap-js-function (or (.-default useMediaQuery) (.-useMediaQuery useMediaQuery))))
