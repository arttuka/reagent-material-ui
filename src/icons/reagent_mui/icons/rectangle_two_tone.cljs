(ns reagent-mui.icons.rectangle-two-tone
  "Imports @mui/icons-material/RectangleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def rectangle-two-tone (create-svg-icon [(e "path" #js {"d" "M4 6h16v12H4z", "opacity" ".3"}) (e "path" #js {"d" "M2 4v16h20V4H2zm18 14H4V6h16v12z"})]
                                         "RectangleTwoTone"))
