(ns reagent-mui.icons.compare
  "Imports @mui/icons-material/Compare as a Reagent component."
  (:refer-clojure :exclude [compare])
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def compare (create-svg-icon (e "path" #js {"d" "M10 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h5v2h2V1h-2v2zm0 15H5l5-6v6zm9-15h-5v2h5v13l-5-6v9h5c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"})
                              "Compare"))
