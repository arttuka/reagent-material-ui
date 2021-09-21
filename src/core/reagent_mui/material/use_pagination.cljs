(ns reagent-mui.material.use-pagination
  "Imports @mui/material/usePagination as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-pagination/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/material/usePagination" :as MuiusePagination]))

(def use-pagination (wrap-js-function (.-default MuiusePagination)))
