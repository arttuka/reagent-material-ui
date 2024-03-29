(ns reagent-mui.icons.view-stream-two-tone
  "Imports @mui/icons-material/ViewStreamTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-stream-two-tone (create-svg-icon [(e "path" #js {"d" "M19 17H5v-4h14v4zM5 11V7h14v4H5z", "opacity" ".3"}) (e "path" #js {"d" "M3 7v10c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2zm16 10H5v-4h14v4zM5 11V7h14v4H5z"})]
                                           "ViewStreamTwoTone"))
