(ns reagent-mui.icons.view-array-two-tone
  "Imports @mui/icons-material/ViewArrayTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-array-two-tone (create-svg-icon [(e "path" #js {"d" "M9 7h6v10H9z", "opacity" ".3"}) (e "path" #js {"d" "M15 7v10H9V7h6zm6-2h-3v14h3V5zm-4 0H7v14h10V5zM6 5H3v14h3V5z"})]
                                          "ViewArrayTwoTone"))
