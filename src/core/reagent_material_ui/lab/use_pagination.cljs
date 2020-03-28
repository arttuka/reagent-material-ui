(ns reagent-material-ui.lab.use-pagination
  "Imports @material-ui/lab/Pagination/usePagination as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-pagination/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/lab/Pagination" :as Pagination]))

(def use-pagination (wrap-js-function (.-usePagination Pagination)))
