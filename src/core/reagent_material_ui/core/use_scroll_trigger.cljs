(ns reagent-material-ui.core.use-scroll-trigger
  "Imports @material-ui/core/useScrollTrigger as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-scroll-trigger/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/useScrollTrigger" :as useScrollTrigger]))

(def use-scroll-trigger (wrap-js-function (or (.-default useScrollTrigger) (.-useScrollTrigger useScrollTrigger))))
