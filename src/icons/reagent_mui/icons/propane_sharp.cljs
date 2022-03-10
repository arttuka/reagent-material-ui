(ns reagent-mui.icons.propane-sharp
  "Imports @mui/icons-material/PropaneSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def propane-sharp (create-svg-icon (e "path" #js {"d" "M16.75 6H16V3H8v3h-.75C3.97 6 1.1 8.53 1 11.82.9 15.21 3.62 18 7 18v3h2v-3h6v3h2v-3c3.38 0 6.1-2.79 6-6.18C22.9 8.53 20.03 6 16.75 6zM10 5h4v1h-4V5z"})
                                    "PropaneSharp"))
