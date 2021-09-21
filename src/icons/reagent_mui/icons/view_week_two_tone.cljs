(ns reagent-mui.icons.view-week-two-tone
  "Imports @mui/icons-material/ViewWeekTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-week-two-tone (create-svg-icon [(e "path" #js {"d" "M8 18H4V6h4v12zm6 0h-4V6h4v12zm6 0h-4V6h4v12z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM8 18H4V6h4v12zm6 0h-4V6h4v12zm6 0h-4V6h4v12z"})]
                                         "ViewWeekTwoTone"))
