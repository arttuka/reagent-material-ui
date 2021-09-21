(ns reagent-mui.icons.carpenter-rounded
  "Imports @mui/icons-material/CarpenterRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def carpenter-rounded (create-svg-icon (e "path" #js {"d" "M19.73 14.23 7.71 2.21a.9959.9959 0 0 0-1.41 0L3.7 4.8c-.34.34-.39.88-.11 1.28l7.65 10.98c-.78.78-.78 2.05 0 2.83l1.41 1.41c.78.78 2.05.78 2.83 0l4.24-4.24c.79-.78.79-2.05.01-2.83zm-5.66 5.65-1.41-1.41 4.24-4.24 1.41 1.41-4.24 4.24z"})
                                        "CarpenterRounded"))
