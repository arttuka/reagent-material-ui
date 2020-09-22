(ns reagent-material-ui.lab.use-pagination
  "Imports @material-ui/lab/Pagination/usePagination as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-pagination/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/lab/Pagination" :as MuiPagination]))

(def use-pagination (wrap-js-function (.-usePagination MuiPagination)))
