(ns reagent-mui.icons.stop-two-tone
  "Imports @mui/icons-material/StopTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stop-two-tone (create-svg-icon [(e "path" #js {"d" "M8 8h8v8H8z", "opacity" ".3"}) (e "path" #js {"d" "M6 18h12V6H6v12zM8 8h8v8H8V8z"})]
                                    "StopTwoTone"))
