(ns reagent-mui.icons.tablet-two-tone
  "Imports @mui/icons-material/TabletTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tablet-two-tone (create-svg-icon [(e "path" #js {"d" "M5 6h14v12H5z", "opacity" ".3"}) (e "path" #js {"d" "M21 4H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h18c1.1 0 1.99-.9 1.99-2L23 6c0-1.1-.9-2-2-2zm-2 14H5V6h14v12z"})]
                                      "TabletTwoTone"))
