(ns reagent-mui.icons.airlines
  "Imports @mui/icons-material/Airlines as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airlines (create-svg-icon (e "path" #js {"d" "M13 4 2 20h17l3-16h-9zm1.5 10c-1.38 0-2.5-1.12-2.5-2.5S13.12 9 14.5 9s2.5 1.12 2.5 2.5-1.12 2.5-2.5 2.5z"})
                               "Airlines"))
