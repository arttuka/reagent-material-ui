(ns reagent-mui.icons.propane-rounded
  "Imports @mui/icons-material/PropaneRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def propane-rounded (create-svg-icon (e "path" #js {"d" "M16.75 6H16V5c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2v1h-.75C3.97 6 1.1 8.53 1 11.82.9 15.21 3.62 18 7 18v2c0 .55.45 1 1 1s1-.45 1-1v-2h6v2c0 .55.45 1 1 1s1-.45 1-1v-2c3.38 0 6.1-2.79 6-6.18C22.9 8.53 20.03 6 16.75 6zM10 5h4v1h-4V5z"})
                                      "PropaneRounded"))
